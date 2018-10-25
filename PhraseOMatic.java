class PhraseOMatic
{

public static void main (String[] args)
{

String[] wordListOne = {"круглосуточный","трех-звенный", "30000-километровый","взаимный","обоюдный выигрыш","фронтэнд","на основе веб-технологий","проникающий","умный","шесть сигм","метод критического пути","динамичный"};
String[] wordListTwo = {"уполномоченный","трудный","чистый продукт","ориентированный","центральный","распределенный ","кластеризованный","фирменный","нестандартный ум","позиционированный","сетевой","сфокусированный","использованный с выгодой", "выровненный","нацеленный на","общий","совместный", "ускоренный"};
String[] wordListThree = {"процесс","пункт разгрузки","выход из положени€","тип структуры","талант","подход","уровень завоеванного внимани€","портал","период времени","обзор","образец","пункт следовани€"};

int oneLength = wordListOne.length;
int twoLength = wordListTwo.length;
int threeLength = wordListThree.length; //вычисл€ем, сколько в каждом массиве элементов

int rand1 = (int)(Math.random()*oneLength);
int rand2 = (int)(Math.random()*twoLength);
int rand3 = (int)(Math.random()*threeLength);//генераци€ случайных чисел

String phrase = wordListOne[rand1]+ " " + wordListTwo[rand2] + " " +wordListThree[rand3];

System.out.println("¬сЄ, что ¬ам нужно - это " + phrase);
}

}	