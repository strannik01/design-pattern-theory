package com.dev21.pd.simplefactory;

import java.io.IOException;

public interface ISimpleFactory {

	Animal createAnimal(int choice) throws IOException;
}
