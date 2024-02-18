package oops;

public abstract class ABC {

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public void d() {
        System.out.println("D");
    }
}

abstract class New_ABC extends ABC {

    @Override
    public void a() {

    }
}

abstract class New_New_ABC extends New_ABC {

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }
}