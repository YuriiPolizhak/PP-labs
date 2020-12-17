package com.company;
import org.apache.commons.lang3.StringUtils;
import patient.Patient;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static int NumOfPatients;
    private static String fileName;

    public static void main(String[] args) {
        fileName="1.txt";   //Задав назву файлу
        Patient[] obj = new Patient[100];
        Enters(fileName, obj);
        System.out.println("Повний список пацієнтів");
        PrintHead();
        PrintFullList(obj);
        Scanner num = new Scanner(System.in);
        System.out.println("Введіть діагноз, щоб побачити список пацієнтів");
        Print_Diagnose(obj,num.nextLine());
        System.out.println("Введіть проміжок для пошуку пацієнтів по мед. карті");
        Print_MedCard(obj, num.nextInt(), num.nextInt());
        System.out.println("Введіть початкову цифру номера телефону для пошуку пацієнта");
        Print_PhoneNumber(obj,num.nextInt());
        num.nextLine(); //зупинка програми
    }
    private static void PrintHead()
    {
        System.out.println("ID\tПрізвище\t\t\t\tІм'я\t\t\t\t\tПо-батькові\t\t\t\t" +
                "Адреса проживання\t\tНомер телефону\t\tМед. картка\t\t\tДіагноз");
    }

    private static void Enters(String fileName,  Patient[] obj) //From a file into object of Class Patient
    {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String buff;

            while((buff =reader.readLine())!=null){
                String[] split_string;
                split_string = buff.split(", ( *\\t*)");
                obj[NumOfPatients]=new Patient(split_string);
                NumOfPatients++;
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error with a file"); System.exit(1);}

    }
    private static void PrintFullList(Patient[]obj)
    {
        for(int i=0; i<NumOfPatients;i++)
        {
            obj[i].Print();
        }
    }
    private static void Print_Diagnose(Patient[] obj, String DiagnoseToSearch) //пацієнти з вказаним діагнозом
    {
        PrintHead();
        for(int i=0; i<NumOfPatients;i++)
        {
            if(Objects.equals(DiagnoseToSearch,obj[i].getDiagnose())) {obj[i].Print();}
        }
    }
    private static void Print_MedCard(Patient[]obj,int Start, int End) //пацієнти, мед. карта у заданому проміжку
    {
        PrintHead();
        for(int i=0; i<NumOfPatients;i++)
        {
            if(Start<=(obj[i].getCardNumber())&&(obj[i].getCardNumber())<=End) {obj[i].Print();}
        }
    }
    private static void Print_PhoneNumber(Patient[]obj, int Num)
    {
        int temp=0;
        PrintHead();
        for(int i=0; i<NumOfPatients;i++)
        {
            if(Num==(obj[i].getPhoneNumber() / (int)(Math.pow(10, (int)(Math.log10(obj[i].getPhoneNumber()))))))
            {obj[i].Print();temp++;}
        }
        System.out.println("Вього "+temp+" пацієнти з номером, що починається на "+Num);
    }
    }