
#include <string.h>

main()
{
	int main(void)

    int age = 25;
 
    // pointeur vers age
    int *ptr1;
 
    // double pointeur vers ptr1
    int **ptr2;
 
    // stocker l'adresse de age dans ptr1
    ptr1 = &age;
 
    // stocker l'adresse de ptr1 dans ptr2
    ptr2 = &ptr1;
 
    // adresse de age sera affich�e
    printf("adresse de age : %x\n", ptr1);
 
    // adresse de ptr1 sera affich�e
    printf("adresse de ptr1: %x\n", ptr2);
 
    // La valeur stock�e � l'adresse contenue par ptr1, c'est-�-dire 25, sera affich�e.
    printf("Valeur de age en utilisant un seul pointeur : %d\n", *ptr1);
 
    // valeur stock�e � l'adresse contenue par le pointeur stock� dans ptr2
    printf("Valeur de age en utilisant le double pointeur : %d\n", **ptr2);
 
    return 0;
    // malloc
    int * p;
    p = malloc (sizeof(int));
    
    // calloc 
    Complexe * p;

     p = calloc (3 , sizeof(Complexe)); 
	 //realoc
	 int * tabentier;
      /* Cr�ation d'un tableau de 3 entiers */
     tabentier = calloc ( 3 , sizeof(int) );
     tabentier[0] = 1;
    tabentier[1] = 2;
    tabentier[2] = 3;
    // l'utilissation de free liberer memoire
	ptr = ( ...) malloc( nb_octets) ; 
	free(ptr) ;
    
	 
}

