# 🧭 Design Pattern — Template Method

## 🎯 Objectif

Le **Template Method** permet de :

> Définir le squelette d’un algorithme dans une classe de base,  
> tout en laissant certaines étapes à la charge des sous-classes.

Ainsi, le comportement général reste identique, mais les détails peuvent varier.

---

## 📂 Catégorie

**Comportement**

---

## ⚙️ Principe général

La classe abstraite :

- définit l’algorithme principal (méthode `template`)
- appelle des méthodes abstraites
- impose une structure commune

Les sous-classes :

- implémentent uniquement les parties variables
Classe Abstraite → Décrit le squelette
Sous-classes → Fournissent les détails

---

## 🧩 Structure de l’exemple

| Élément | Rôle |
|--------|------|
| `Template` | Contient l’algorithme général (`perform`) |
| `MoroccoTemplate` | Implémentation spécifique pour le Maroc |
| `SpaineTmplate` | Implémentation spécifique pour l’Espagne |
| `Test` | Démonstration |

---

## 💻 Code

### 🔹 Classe abstraite — squelette de l’algorithme
```java
public abstract class Template {
    
    public double perform(int a, int b) {

        int n = param1();
        double sum = 0;

        for (int i = 0; i < n; i++) {
            double step1 = compute(a, b);
            sum += step1;
        }

        return sum;
    }

    protected abstract double compute(int a, int b);
    protected abstract int param1();
}
```

---
### 🔹 Implémentation — Morocco
````java
public class MoroccoTemplate extends Template {

    @Override
    protected int param1() {
        return 3;
    }

    @Override
    protected double compute(int a, int b) {
        return Math.sqrt(a * a + b * b);
    }
}
````
---
### 🔹 Implémentation — Spain
````java
public class SpaineTmplate extends Template {

    @Override
    protected int param1() {
        return 9;
    }

    @Override
    protected double compute(int a, int b) {
        return a * b;
    }
}
````


---
### 🔹 Classe de test

````java
public class Test {

    public static void main(String[] args) {

        Template moroccoTemplate = new MoroccoTemplate();
        System.out.println("Morocco: " + moroccoTemplate.perform(2, 5));

        Template spainTemplate = new SpaineTmplate();
        System.out.println("Spain: " + spainTemplate.perform(2, 5));
    }
}
````
---
## 🧪 Résultat d’exécution
````text
Morocco: 16.15549442140351
Spain: 90.0
````

----
👨‍💻 **RABIH Hamza** - M2- II-BDCC- ENSET Mohammédia
