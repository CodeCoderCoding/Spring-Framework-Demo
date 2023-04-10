package com.supremepole.springconditional;

/**
 * @author CodeCoderCoding
 */
public class WindowsListServiceImpl implements ListService {

    @Override
    public String showListCmd() {
        return "dir";
    }

}
