#include <unistd.h>
#include <fcntl.h>
#include <string.h>
#include <stdio.h>
#include <unistd.h>

int main()
{
    char buffer[128] = {0x00};

    /* Read info from sht20 */
    int fd = open("/dev/amg8833", O_RDWR);
    if (fd < 0) {
    	printf("Error: cannot open file.\n");
	    return -1;
    }
    printf("Open success\n");
    while(1) {

    	read(fd, &buffer, 128);

        for(int idx = 0; idx < 128; idx+=2) {
            printf("%e,", (buffer[idx] | buffer[idx+1] << 8) * 0.25);
        }
        
    	printf("\n");

	    sleep(0.1);
    }
    close(fd);
    return 0;
}
