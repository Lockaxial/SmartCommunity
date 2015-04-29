#include <math.h>
#include <fstream.h>
#include <opencv2/opencv.hpp>
#define MAX
#include "array.h"
    /*1.��˹�˲���ͼ��ȥ�롣
	2.��ԭʼ�Ҷ�ͼ����ݺ�2���ݶ�ͼ���Լ��ۺ��ݶ�ͼ�����ݶȵ����Ӻࣩܶ��
	3.���3�� �ݶ�ͼ�����зǼ������ƣ��˲�һ��������ͼ���Ե�Ѿ���ϸ�ˣ�
	4.���б�Ե���ӣ�ǿ��Ե�� ����Ե�����ӣ����п������ӵĵ㶼�����˷Ǽ������ƺ�ķ�Χ���ڷǼ������ƵĽ����ȥ���ٱ�Ե�������Ե��ͬʱ�����ñ����� ��Ե����������ʵ��
	5.�Ա�Ե����ϸ��
	*/
/* Scale floating point magnitudes and angles to 8 bits */
#define ORI_SCALE 40.0
#define MAG_SCALE 20.0

/* Biggest possible filter mask */
#define MAX_MASK_SIZE 20

/* Fraction of pixels that should be above the HIGH threshold */

float ratio = 0.1;
int WIDTH = 0;
typedef uc2D IMAGE;


float gauss(float x, float sigma);
float dGauss (float x, float sigma);
float meanGauss (float x, float sigma);

//Ѱ�ұ߽����
int range (IMAGE& im, int i, int j);
int trace (int i, int j, int low, IMAGE& im,IMAGE& mag, IMAGE& ori);
//ͳ��ֱ��ͼ���ж���ֵ
void estimate_thresh (IMAGE& mag, int *low, int *hi);
void hysteresis (int high, int low, IMAGE& im, IMAGE& mag, IMAGE& oriim);



//�������
void seperable_convolution (IMAGE& im, float *gau, int width,
		f2D& smx, f2D& smy);
void dxy_seperable_convolution (f2D& im, int nr, int nc, float *gau,
		int width, f2D& sm, int which);

//�����ֵ����
void nonmax_suppress (f2D& dx, f2D& dy, int nr, int nc,
		IMAGE& mag, IMAGE& ori);

void canny (float s, IMAGE& im, IMAGE& mag, IMAGE& ori);


const double M_PI=3.14159265358979323846;
const double ZER_INFINITY=1.22e10;
const double ZER_TINY=1e-6;

const int ZER_NO_MEMORY=-10;
const int ZER_ERROR=-1;
const int ZER_OK=0;

/** *  zer_pol() computes the zernike basis function *   
 V(n,m,x,y). 
 * @return res[1] is the dcomplex for V(n,m,x,y)*/

int zer_pol(int m,int n,double x,double y,