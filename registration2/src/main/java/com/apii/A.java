package com.apii;

import java.util.*;
import java.util.stream.Collectors;

public class A {


    public static void main(String[] args) {

       //Function Functional Interface
//
//        Function<String,Integer> x= s->s.length();
//        Integer val=x.apply("mike");
//        System.out.println(val);

//        Function<Integer,Integer> x= s->s*s;
//        Integer val=x.apply(100);
//        System.out.println(val);

//           List<Integer> data = Arrays.asList(10,20,35,12,14);
//            List<Integer> newData = data.stream().map(x->x*x).collect(Collectors.toList());
//            System.out.println(newData);

//        List<Integer> data = Arrays.asList(10,20,35,12,14);
//        List<Integer> newData = data.stream().map(x->x+5).collect(Collectors.toList());
//        System.out.println(newData);

//        List<String> data = Arrays.asList("mike","stalin","adam");
//        List<String> newData = data.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
//        System.out.println(newData);

//        List<String> data = Arrays.asList("mike","stalin","adam");
//        List<Integer> newData = data.stream().map(x->x.length()).collect(Collectors.toList());
//        System.out.println(newData);

//        List<String> data = Arrays.asList("mike","stalin","adam","stalin","mike","mike","stalin");
//        List<String> newData = data.stream().distinct().collect(Collectors.toList());
//        System.out.println(newData);
//
//        List<String> data = Arrays.asList("mike","stalin","adam","stalin","mike","mike","stalin");
//        List<String> newData = data.stream().distinct().collect(Collectors.toList());
//        System.out.println(newData);





//        List<String> data = Arrays.asList("mike","stalin","adam");
//        List<String> newData = data.stream().sorted().collect(Collectors.toList());
//        System.out.println(newData);

//        List<String> data = Arrays.asList("mike","stalin","adam","stalin");
//        List<String> newData = data.stream().filter(s->s.length()>4).collect(Collectors.toList());
//        System.out.println(newData);
   //Consumer unctional Interface
        //It takes one input & produces no output

//         Consumer<String > x= s-> System.out.println(s);
//         x.accept("mike");
//        List<String>names=Arrays.asList("Rahul","Amit","Sou","Ram");
//        Consumer<String> val=  s-> System.out.println(s);
//        names.forEach(val);

//         List<Employee> data = Arrays.asList(
//                new Employee(1,"mike",5000),
//                new Employee(2,"stalin",4000),
//                new Employee(3,"adam",7000)
//         );

      //   List <Employee> newData = data.stream().filter(e->e.getSal()>4000).collect(Collectors.toList());
//
//      List <Employee> newData = data.stream().filter(e->e.getName().startsWith("m")).collect(Collectors.toList());


        //group by
//        Map<Integer,List<Employee>> newData = data.stream().collect(Collectors.groupingBy(e->e.getSal()));
//        System.out.println(newData);

        //sum of given element
//        List <Integer> data = Arrays.asList(10,20,13,15);
//        int result = data.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(result);

        //Max number given the list
//        List<Integer> numbers =Arrays.asList(3,5,7,2,8,10);
//        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
//        System.out.println(max.get());  
      List<Employee> employees = Arrays.asList(
               new Employee(1,"mike"),
               new Employee(2,"stalin"),
               new Employee(3,"adam")
       );
       List<EmployeeDto> dtos = employees.stream().map(A::mapToDto).collect(Collectors.toList());
    }
  static EmployeeDto mapToDto(Employee employee){
        EmployeeDto dto =new EmployeeDto();
        dto.setId(employee.getId());
        dto.setName(employee.getName());
        return dto;
    }

}
