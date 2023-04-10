package com.supremepole.springscope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author CodeCoderCoding
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
