# AlgoSecondLab
Instruction:
To run whole code and algorythm, you need to run it directly from Main, otherwise it will not work properly.
In class Main you will see: 

public static void main(String[] args) {
        int[] array = {1,2,8,4,9}; // array option
        int angry_cows = 3;        // number of cows (need to be 3 to work properly with algorythm, to show distribution(розподіл) case, otherwise it will do search method)
        Algorythm algorythm = new Algorythm();
        algorythm.search(array, angry_cows);
    }
    


Task: 

Фермер Джон побудував новий довгий загін для худоби, з N (2 <= N <= 100,000) секцій. Секції розташовуються уздовж прямої лінії в положеннях x1, ..., xN (0 <= x-i <= 1 000 000 000).

Його C (2 <= C <= N) корів не люблять нову будівлю і стають агресивними одна до одної, коли вони поставлені в сусідні стійла. Щоб уникнути ситуації, коли корови можуть заподіяти шкоду одна одній, фермер хоче розташувати агресивних корів у стійлах таким чином, щоб мінімальна відстань між будь-якими з них була настільки великою, наскільки це можливо. Яка найбільша мінімальна відстань?

Вхідні дані містяться у файлі, де:
Перший рядок містить два цілих числа, розділених комою: N та C
Наступні рядки 2..N + 1: рядок i + 1 містить ціле число, яке означає номер вільного стійла x-і

Input:


1
2
8
4
9

Output:
3
Пояснення: 
У фермера є 5 корів, з яких 3 агресивні. Їх можна роташувати в стійлах 1, 4 та 8 або 1,4, 9. Таким чином мінімальне значення максимальної дистанції становить 3

Підказка:
Оскільки у нас є щонайменше дві корови, найкраще, що ми можемо зробити, це розташувати їх у загоні у першому вільному стійлі і в кінці

Time complexity: Логарифмічна (O(log n) оскільки, час зростає пропорційно логарифмічного розміру вхідних даних, саме тому в умові 1,2,4,8,9 це - вільні місця, з яких 3 - агресивні корови
