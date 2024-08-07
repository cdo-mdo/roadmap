BIN=Solution
all:
	g++ --coverage $(BIN).cpp -o $(BIN)
	./$(BIN)
	gcovr
	valgrind ./$(BIN)
clean:
	rm $(BIN) *.gcda *.gcno
