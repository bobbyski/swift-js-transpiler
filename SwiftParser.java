// Generated from Swift.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SwiftParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, Platform=103, Regular_identifier=104, DOT=105, LCURLY=106, 
		LPAREN=107, LBRACK=108, RCURLY=109, RPAREN=110, RBRACK=111, COMMA=112, 
		COLON=113, SEMI=114, LT=115, GT=116, UNDERSCORE=117, BANG=118, QUESTION=119, 
		AT=120, AND=121, SUB=122, EQUAL=123, OR=124, DIV=125, ADD=126, MUL=127, 
		MOD=128, CARET=129, TILDE=130, Operator_head_other=131, Operator_following_character=132, 
		Implicit_parameter_name=133, Binary_literal=134, Octal_literal=135, Decimal_literal=136, 
		Pure_decimal_digits=137, Hexadecimal_literal=138, Floating_point_literal=139, 
		Static_string_literal=140, Interpolated_string_literal=141, WS=142, Block_comment=143, 
		Line_comment=144;
	public static final int
		RULE_top_level = 0, RULE_statement = 1, RULE_statements = 2, RULE_semicolon = 3, 
		RULE_loop_statement = 4, RULE_for_statement = 5, RULE_for_init = 6, RULE_for_in_statement = 7, 
		RULE_while_statement = 8, RULE_condition_clause = 9, RULE_condition_list = 10, 
		RULE_condition = 11, RULE_case_condition = 12, RULE_optional_binding_condition = 13, 
		RULE_optional_binding_head = 14, RULE_optional_binding_continuation_list = 15, 
		RULE_repeat_while_statement = 16, RULE_branch_statement = 17, RULE_if_statement = 18, 
		RULE_else_clause = 19, RULE_guard_statement = 20, RULE_switch_statement = 21, 
		RULE_switch_cases = 22, RULE_switch_case = 23, RULE_case_label = 24, RULE_case_item_list = 25, 
		RULE_default_label = 26, RULE_where_clause = 27, RULE_where_expression = 28, 
		RULE_labeled_statement = 29, RULE_statement_label = 30, RULE_label_name = 31, 
		RULE_control_transfer_statement = 32, RULE_break_statement = 33, RULE_continue_statement = 34, 
		RULE_fallthrough_statement = 35, RULE_return_statement = 36, RULE_availability_condition = 37, 
		RULE_availability_arguments = 38, RULE_availability_argument = 39, RULE_throw_statement = 40, 
		RULE_defer_statement = 41, RULE_do_statement = 42, RULE_catch_clauses = 43, 
		RULE_catch_clause = 44, RULE_compiler_control_statement = 45, RULE_build_configuration_statement = 46, 
		RULE_build_configuration_elseif_clauses = 47, RULE_build_configuration_elseif_clause = 48, 
		RULE_build_configuration_else_clause = 49, RULE_build_configuration = 50, 
		RULE_platform_testing_function = 51, RULE_operating_system = 52, RULE_architecture = 53, 
		RULE_line_control_statement = 54, RULE_line_number = 55, RULE_file_name = 56, 
		RULE_generic_parameter_clause = 57, RULE_generic_parameter_list = 58, 
		RULE_generic_parameter = 59, RULE_requirement_clause = 60, RULE_requirement_list = 61, 
		RULE_requirement = 62, RULE_conformance_requirement = 63, RULE_same_type_requirement = 64, 
		RULE_generic_argument_clause = 65, RULE_generic_argument_list = 66, RULE_generic_argument = 67, 
		RULE_declaration = 68, RULE_declarations = 69, RULE_top_level_declaration = 70, 
		RULE_code_block = 71, RULE_import_declaration = 72, RULE_import_kind = 73, 
		RULE_import_path = 74, RULE_import_path_identifier = 75, RULE_constant_declaration = 76, 
		RULE_pattern_initializer_list = 77, RULE_pattern_initializer = 78, RULE_initializer = 79, 
		RULE_variable_declaration = 80, RULE_variable_declaration_head = 81, RULE_variable_name = 82, 
		RULE_getter_setter_block = 83, RULE_getter_clause = 84, RULE_setter_clause = 85, 
		RULE_setter_name = 86, RULE_getter_setter_keyword_block = 87, RULE_getter_keyword_clause = 88, 
		RULE_setter_keyword_clause = 89, RULE_willSet_didSet_block = 90, RULE_willSet_clause = 91, 
		RULE_didSet_clause = 92, RULE_typealias_declaration = 93, RULE_typealias_head = 94, 
		RULE_typealias_name = 95, RULE_typealias_assignment = 96, RULE_function_declaration = 97, 
		RULE_function_head = 98, RULE_function_name = 99, RULE_function_signature = 100, 
		RULE_function_result = 101, RULE_function_body = 102, RULE_parameter_clauses = 103, 
		RULE_parameter_clause = 104, RULE_parameter_list = 105, RULE_parameter = 106, 
		RULE_external_parameter_name = 107, RULE_local_parameter_name = 108, RULE_default_argument_clause = 109, 
		RULE_enum_declaration = 110, RULE_union_style_enum = 111, RULE_union_style_enum_members = 112, 
		RULE_union_style_enum_member = 113, RULE_union_style_enum_case_clause = 114, 
		RULE_union_style_enum_case_list = 115, RULE_union_style_enum_case = 116, 
		RULE_enum_name = 117, RULE_enum_case_name = 118, RULE_raw_value_style_enum = 119, 
		RULE_raw_value_style_enum_members = 120, RULE_raw_value_style_enum_member = 121, 
		RULE_raw_value_style_enum_case_clause = 122, RULE_raw_value_style_enum_case_list = 123, 
		RULE_raw_value_style_enum_case = 124, RULE_raw_value_assignment = 125, 
		RULE_raw_value_literal = 126, RULE_struct_declaration = 127, RULE_struct_name = 128, 
		RULE_struct_body = 129, RULE_class_declaration = 130, RULE_class_name = 131, 
		RULE_class_body = 132, RULE_protocol_declaration = 133, RULE_protocol_name = 134, 
		RULE_protocol_body = 135, RULE_protocol_member_declaration = 136, RULE_protocol_member_declarations = 137, 
		RULE_protocol_property_declaration = 138, RULE_protocol_method_declaration = 139, 
		RULE_protocol_initializer_declaration = 140, RULE_protocol_subscript_declaration = 141, 
		RULE_protocol_associated_type_declaration = 142, RULE_initializer_declaration = 143, 
		RULE_initializer_head = 144, RULE_initializer_body = 145, RULE_deinitializer_declaration = 146, 
		RULE_extension_declaration = 147, RULE_extension_body = 148, RULE_subscript_declaration = 149, 
		RULE_subscript_head = 150, RULE_subscript_result = 151, RULE_operator_declaration = 152, 
		RULE_prefix_operator_declaration = 153, RULE_postfix_operator_declaration = 154, 
		RULE_infix_operator_declaration = 155, RULE_infix_operator_attributes = 156, 
		RULE_precedence_clause = 157, RULE_precedence_level = 158, RULE_associativity_clause = 159, 
		RULE_associativity = 160, RULE_declaration_modifier = 161, RULE_declaration_modifiers = 162, 
		RULE_access_level_modifier = 163, RULE_pattern = 164, RULE_wildcard_pattern = 165, 
		RULE_identifier_pattern = 166, RULE_value_binding_pattern = 167, RULE_tuple_pattern = 168, 
		RULE_tuple_pattern_element_list = 169, RULE_tuple_pattern_element = 170, 
		RULE_enum_case_pattern = 171, RULE_optional_pattern = 172, RULE_expression_pattern = 173, 
		RULE_attribute = 174, RULE_attribute_name = 175, RULE_attribute_argument_clause = 176, 
		RULE_attributes = 177, RULE_balanced_tokens = 178, RULE_balanced_token = 179, 
		RULE_expression = 180, RULE_expression_list = 181, RULE_prefix_expression = 182, 
		RULE_in_out_expression = 183, RULE_try_operator = 184, RULE_binary_expression = 185, 
		RULE_binary_expressions = 186, RULE_conditional_operator = 187, RULE_type_casting_operator = 188, 
		RULE_primary_expression = 189, RULE_implicit_member_expression = 190, 
		RULE_literal_expression = 191, RULE_array_literal = 192, RULE_array_literal_items = 193, 
		RULE_array_literal_item = 194, RULE_dictionary_literal = 195, RULE_dictionary_literal_items = 196, 
		RULE_dictionary_literal_item = 197, RULE_empty_dictionary_literal = 198, 
		RULE_self_expression = 199, RULE_superclass_expression = 200, RULE_superclass_method_expression = 201, 
		RULE_superclass_subscript_expression = 202, RULE_superclass_initializer_expression = 203, 
		RULE_closure_expression = 204, RULE_explicit_closure_expression = 205, 
		RULE_closure_signature = 206, RULE_capture_list = 207, RULE_capture_list_items = 208, 
		RULE_capture_list_item = 209, RULE_capture_specifier = 210, RULE_parenthesized_expression = 211, 
		RULE_expression_element_list = 212, RULE_expression_element = 213, RULE_wildcard_expression = 214, 
		RULE_selector_expression = 215, RULE_postfix_expression = 216, RULE_chain_postfix_expression = 217, 
		RULE_argument_names = 218, RULE_argument_name = 219, RULE_trailing_closure = 220, 
		RULE_type = 221, RULE_optional_type = 222, RULE_array_definition = 223, 
		RULE_dictionary_definition = 224, RULE_type_annotation = 225, RULE_type_identifier = 226, 
		RULE_type_name = 227, RULE_tuple_type = 228, RULE_tuple_type_body = 229, 
		RULE_tuple_type_element_list = 230, RULE_tuple_type_element = 231, RULE_element_name = 232, 
		RULE_protocol_composition_type = 233, RULE_protocol_identifier_list = 234, 
		RULE_protocol_identifier = 235, RULE_type_inheritance_clause = 236, RULE_type_inheritance_list = 237, 
		RULE_class_requirement = 238, RULE_identifier = 239, RULE_identifier_list = 240, 
		RULE_context_sensitive_keyword = 241, RULE_assignment_operator = 242, 
		RULE_negate_prefix_operator = 243, RULE_build_AND = 244, RULE_build_OR = 245, 
		RULE_arrow_operator = 246, RULE_range_operator = 247, RULE_same_type_equals = 248, 
		RULE_binary_operator = 249, RULE_prefix_operator = 250, RULE_postfix_operator = 251, 
		RULE_operator = 252, RULE_operator_character = 253, RULE_operator_head = 254, 
		RULE_dot_operator_head = 255, RULE_dot_operator_character = 256, RULE_literal = 257, 
		RULE_numeric_literal = 258, RULE_boolean_literal = 259, RULE_nil_literal = 260, 
		RULE_integer_literal = 261, RULE_string_literal = 262;
	public static final String[] ruleNames = {
		"top_level", "statement", "statements", "semicolon", "loop_statement", 
		"for_statement", "for_init", "for_in_statement", "while_statement", "condition_clause", 
		"condition_list", "condition", "case_condition", "optional_binding_condition", 
		"optional_binding_head", "optional_binding_continuation_list", "repeat_while_statement", 
		"branch_statement", "if_statement", "else_clause", "guard_statement", 
		"switch_statement", "switch_cases", "switch_case", "case_label", "case_item_list", 
		"default_label", "where_clause", "where_expression", "labeled_statement", 
		"statement_label", "label_name", "control_transfer_statement", "break_statement", 
		"continue_statement", "fallthrough_statement", "return_statement", "availability_condition", 
		"availability_arguments", "availability_argument", "throw_statement", 
		"defer_statement", "do_statement", "catch_clauses", "catch_clause", "compiler_control_statement", 
		"build_configuration_statement", "build_configuration_elseif_clauses", 
		"build_configuration_elseif_clause", "build_configuration_else_clause", 
		"build_configuration", "platform_testing_function", "operating_system", 
		"architecture", "line_control_statement", "line_number", "file_name", 
		"generic_parameter_clause", "generic_parameter_list", "generic_parameter", 
		"requirement_clause", "requirement_list", "requirement", "conformance_requirement", 
		"same_type_requirement", "generic_argument_clause", "generic_argument_list", 
		"generic_argument", "declaration", "declarations", "top_level_declaration", 
		"code_block", "import_declaration", "import_kind", "import_path", "import_path_identifier", 
		"constant_declaration", "pattern_initializer_list", "pattern_initializer", 
		"initializer", "variable_declaration", "variable_declaration_head", "variable_name", 
		"getter_setter_block", "getter_clause", "setter_clause", "setter_name", 
		"getter_setter_keyword_block", "getter_keyword_clause", "setter_keyword_clause", 
		"willSet_didSet_block", "willSet_clause", "didSet_clause", "typealias_declaration", 
		"typealias_head", "typealias_name", "typealias_assignment", "function_declaration", 
		"function_head", "function_name", "function_signature", "function_result", 
		"function_body", "parameter_clauses", "parameter_clause", "parameter_list", 
		"parameter", "external_parameter_name", "local_parameter_name", "default_argument_clause", 
		"enum_declaration", "union_style_enum", "union_style_enum_members", "union_style_enum_member", 
		"union_style_enum_case_clause", "union_style_enum_case_list", "union_style_enum_case", 
		"enum_name", "enum_case_name", "raw_value_style_enum", "raw_value_style_enum_members", 
		"raw_value_style_enum_member", "raw_value_style_enum_case_clause", "raw_value_style_enum_case_list", 
		"raw_value_style_enum_case", "raw_value_assignment", "raw_value_literal", 
		"struct_declaration", "struct_name", "struct_body", "class_declaration", 
		"class_name", "class_body", "protocol_declaration", "protocol_name", "protocol_body", 
		"protocol_member_declaration", "protocol_member_declarations", "protocol_property_declaration", 
		"protocol_method_declaration", "protocol_initializer_declaration", "protocol_subscript_declaration", 
		"protocol_associated_type_declaration", "initializer_declaration", "initializer_head", 
		"initializer_body", "deinitializer_declaration", "extension_declaration", 
		"extension_body", "subscript_declaration", "subscript_head", "subscript_result", 
		"operator_declaration", "prefix_operator_declaration", "postfix_operator_declaration", 
		"infix_operator_declaration", "infix_operator_attributes", "precedence_clause", 
		"precedence_level", "associativity_clause", "associativity", "declaration_modifier", 
		"declaration_modifiers", "access_level_modifier", "pattern", "wildcard_pattern", 
		"identifier_pattern", "value_binding_pattern", "tuple_pattern", "tuple_pattern_element_list", 
		"tuple_pattern_element", "enum_case_pattern", "optional_pattern", "expression_pattern", 
		"attribute", "attribute_name", "attribute_argument_clause", "attributes", 
		"balanced_tokens", "balanced_token", "expression", "expression_list", 
		"prefix_expression", "in_out_expression", "try_operator", "binary_expression", 
		"binary_expressions", "conditional_operator", "type_casting_operator", 
		"primary_expression", "implicit_member_expression", "literal_expression", 
		"array_literal", "array_literal_items", "array_literal_item", "dictionary_literal", 
		"dictionary_literal_items", "dictionary_literal_item", "empty_dictionary_literal", 
		"self_expression", "superclass_expression", "superclass_method_expression", 
		"superclass_subscript_expression", "superclass_initializer_expression", 
		"closure_expression", "explicit_closure_expression", "closure_signature", 
		"capture_list", "capture_list_items", "capture_list_item", "capture_specifier", 
		"parenthesized_expression", "expression_element_list", "expression_element", 
		"wildcard_expression", "selector_expression", "postfix_expression", "chain_postfix_expression", 
		"argument_names", "argument_name", "trailing_closure", "type", "optional_type", 
		"array_definition", "dictionary_definition", "type_annotation", "type_identifier", 
		"type_name", "tuple_type", "tuple_type_body", "tuple_type_element_list", 
		"tuple_type_element", "element_name", "protocol_composition_type", "protocol_identifier_list", 
		"protocol_identifier", "type_inheritance_clause", "type_inheritance_list", 
		"class_requirement", "identifier", "identifier_list", "context_sensitive_keyword", 
		"assignment_operator", "negate_prefix_operator", "build_AND", "build_OR", 
		"arrow_operator", "range_operator", "same_type_equals", "binary_operator", 
		"prefix_operator", "postfix_operator", "operator", "operator_character", 
		"operator_head", "dot_operator_head", "dot_operator_character", "literal", 
		"numeric_literal", "boolean_literal", "nil_literal", "integer_literal", 
		"string_literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'for'", "'case'", "'in'", "'while'", "'let'", "'var'", "'repeat'", 
		"'if'", "'else'", "'guard'", "'switch'", "'default'", "'where'", "'break'", 
		"'continue'", "'fallthrough'", "'return'", "'#available'", "'throw'", 
		"'defer'", "'do'", "'catch'", "'#if'", "'#endif'", "'#elseif'", "'#else'", 
		"'os'", "'arch'", "'OSX'", "'iOS'", "'watchOS'", "'tvOS'", "'i386'", "'x86_64'", 
		"'arm'", "'arm64'", "'#line'", "'import'", "'typealias'", "'struct'", 
		"'class'", "'enum'", "'protocol'", "'func'", "'get'", "'set'", "'willSet'", 
		"'didSet'", "'throws'", "'rethrows'", "'inout'", "'indirect'", "'associatedtype'", 
		"'init'", "'deinit'", "'extension'", "'subscript'", "'prefix'", "'operator'", 
		"'postfix'", "'infix'", "'precedence'", "'associativity'", "'left'", "'right'", 
		"'none'", "'convenience'", "'dynamic'", "'final'", "'lazy'", "'mutating'", 
		"'nonmutating'", "'optional'", "'override'", "'required'", "'static'", 
		"'unowned'", "'safe'", "'unsafe'", "'weak'", "'internal'", "'private'", 
		"'public'", "'is'", "'as'", "'try'", "'__FILE__'", "'__LINE__'", "'__COLUMN__'", 
		"'__FUNCTION__'", "'self'", "'super'", "'unowned(safe)'", "'unowned(unsafe)'", 
		"'#selector'", "'dynamicType'", "'Type'", "'Protocol'", "'`'", "'true'", 
		"'false'", "'nil'", null, null, "'.'", "'{'", "'('", "'['", "'}'", "')'", 
		"']'", "','", "':'", "';'", "'<'", "'>'", "'_'", "'!'", "'?'", "'@'", 
		"'&'", "'-'", "'='", "'|'", "'/'", "'+'", "'*'", "'%'", "'^'", "'~'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "Platform", "Regular_identifier", 
		"DOT", "LCURLY", "LPAREN", "LBRACK", "RCURLY", "RPAREN", "RBRACK", "COMMA", 
		"COLON", "SEMI", "LT", "GT", "UNDERSCORE", "BANG", "QUESTION", "AT", "AND", 
		"SUB", "EQUAL", "OR", "DIV", "ADD", "MUL", "MOD", "CARET", "TILDE", "Operator_head_other", 
		"Operator_following_character", "Implicit_parameter_name", "Binary_literal", 
		"Octal_literal", "Decimal_literal", "Pure_decimal_digits", "Hexadecimal_literal", 
		"Floating_point_literal", "Static_string_literal", "Interpolated_string_literal", 
		"WS", "Block_comment", "Line_comment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Swift.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SwiftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Top_levelContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SwiftParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Top_levelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_level; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTop_level(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTop_level(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTop_level(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Top_levelContext top_level() throws RecognitionException {
		Top_levelContext _localctx = new Top_levelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_top_level);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(526);
					statement();
					}
					} 
				}
				setState(531);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(532);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Branch_statementContext branch_statement() {
			return getRuleContext(Branch_statementContext.class,0);
		}
		public Labeled_statementContext labeled_statement() {
			return getRuleContext(Labeled_statementContext.class,0);
		}
		public Control_transfer_statementContext control_transfer_statement() {
			return getRuleContext(Control_transfer_statementContext.class,0);
		}
		public Defer_statementContext defer_statement() {
			return getRuleContext(Defer_statementContext.class,0);
		}
		public Do_statementContext do_statement() {
			return getRuleContext(Do_statementContext.class,0);
		}
		public Compiler_control_statementContext compiler_control_statement() {
			return getRuleContext(Compiler_control_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(567);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				expression();
				setState(536);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(535);
					semicolon();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
				declaration();
				setState(540);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(539);
					semicolon();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(542);
				loop_statement();
				setState(544);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(543);
					semicolon();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(546);
				branch_statement();
				setState(548);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(547);
					semicolon();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(550);
				labeled_statement();
				setState(552);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(551);
					semicolon();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(554);
				control_transfer_statement();
				setState(556);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(555);
					semicolon();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(558);
				defer_statement();
				setState(560);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(559);
					semicolon();
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(562);
				do_statement();
				setState(564);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(563);
					semicolon();
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(566);
				compiler_control_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(570); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(569);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(572); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SemicolonContext extends ParserRuleContext {
		public SemicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemicolonContext semicolon() throws RecognitionException {
		SemicolonContext _localctx = new SemicolonContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_statementContext extends ParserRuleContext {
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public For_in_statementContext for_in_statement() {
			return getRuleContext(For_in_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Repeat_while_statementContext repeat_while_statement() {
			return getRuleContext(Repeat_while_statementContext.class,0);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLoop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLoop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitLoop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loop_statement);
		try {
			setState(580);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				for_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(577);
				for_in_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(578);
				while_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(579);
				repeat_while_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statementContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public For_initContext for_init() {
			return getRuleContext(For_initContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_for_statement);
		try {
			setState(610);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				match(T__0);
				setState(584);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(583);
					for_init();
					}
					break;
				}
				setState(586);
				match(SEMI);
				setState(588);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(587);
					expression();
					}
					break;
				}
				setState(590);
				match(SEMI);
				setState(592);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(591);
					expression();
					}
					break;
				}
				setState(594);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(595);
				match(T__0);
				setState(596);
				match(LPAREN);
				setState(598);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(597);
					for_init();
					}
					break;
				}
				setState(600);
				match(SEMI);
				setState(602);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(601);
					expression();
					}
					break;
				}
				setState(604);
				match(SEMI);
				setState(606);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(605);
					expression();
					}
					break;
				}
				setState(608);
				match(RPAREN);
				setState(609);
				code_block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_initContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public For_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFor_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFor_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFor_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_initContext for_init() throws RecognitionException {
		For_initContext _localctx = new For_initContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_init);
		try {
			setState(614);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				expression_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_in_statementContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public For_in_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_in_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFor_in_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFor_in_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFor_in_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_in_statementContext for_in_statement() throws RecognitionException {
		For_in_statementContext _localctx = new For_in_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_for_in_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(T__0);
			setState(618);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(617);
				match(T__1);
				}
				break;
			}
			setState(620);
			pattern(0);
			setState(621);
			match(T__2);
			setState(622);
			expression();
			setState(624);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(623);
				where_clause();
				}
			}

			setState(626);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public Condition_clauseContext condition_clause() {
			return getRuleContext(Condition_clauseContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(T__3);
			setState(629);
			condition_clause();
			setState(630);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_clauseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Condition_listContext condition_list() {
			return getRuleContext(Condition_listContext.class,0);
		}
		public Availability_conditionContext availability_condition() {
			return getRuleContext(Availability_conditionContext.class,0);
		}
		public Condition_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCondition_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCondition_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCondition_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_clauseContext condition_clause() throws RecognitionException {
		Condition_clauseContext _localctx = new Condition_clauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condition_clause);
		try {
			setState(642);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(632);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				expression();
				setState(634);
				match(COMMA);
				setState(635);
				condition_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(637);
				condition_list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(638);
				availability_condition();
				setState(639);
				match(COMMA);
				setState(640);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_listContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public Condition_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCondition_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCondition_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCondition_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_listContext condition_list() throws RecognitionException {
		Condition_listContext _localctx = new Condition_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			condition();
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(645);
				match(COMMA);
				setState(646);
				condition();
				}
				}
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public Availability_conditionContext availability_condition() {
			return getRuleContext(Availability_conditionContext.class,0);
		}
		public Case_conditionContext case_condition() {
			return getRuleContext(Case_conditionContext.class,0);
		}
		public Optional_binding_conditionContext optional_binding_condition() {
			return getRuleContext(Optional_binding_conditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition);
		try {
			setState(655);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				availability_condition();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				case_condition();
				}
				break;
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(654);
				optional_binding_condition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_conditionContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Case_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCase_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCase_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCase_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_conditionContext case_condition() throws RecognitionException {
		Case_conditionContext _localctx = new Case_conditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_case_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			match(T__1);
			setState(658);
			pattern(0);
			setState(659);
			initializer();
			setState(661);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(660);
				where_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optional_binding_conditionContext extends ParserRuleContext {
		public Optional_binding_headContext optional_binding_head() {
			return getRuleContext(Optional_binding_headContext.class,0);
		}
		public Optional_binding_continuation_listContext optional_binding_continuation_list() {
			return getRuleContext(Optional_binding_continuation_listContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Optional_binding_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_binding_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOptional_binding_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOptional_binding_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitOptional_binding_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_binding_conditionContext optional_binding_condition() throws RecognitionException {
		Optional_binding_conditionContext _localctx = new Optional_binding_conditionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_optional_binding_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			optional_binding_head();
			setState(665);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(664);
				optional_binding_continuation_list();
				}
				break;
			}
			setState(668);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(667);
				where_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optional_binding_headContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Optional_binding_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_binding_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOptional_binding_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOptional_binding_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitOptional_binding_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_binding_headContext optional_binding_head() throws RecognitionException {
		Optional_binding_headContext _localctx = new Optional_binding_headContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_optional_binding_head);
		try {
			setState(678);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(670);
				match(T__4);
				setState(671);
				pattern(0);
				setState(672);
				initializer();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				match(T__5);
				setState(675);
				pattern(0);
				setState(676);
				initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optional_binding_continuation_listContext extends ParserRuleContext {
		public List<Optional_binding_headContext> optional_binding_head() {
			return getRuleContexts(Optional_binding_headContext.class);
		}
		public Optional_binding_headContext optional_binding_head(int i) {
			return getRuleContext(Optional_binding_headContext.class,i);
		}
		public Optional_binding_continuation_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_binding_continuation_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOptional_binding_continuation_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOptional_binding_continuation_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitOptional_binding_continuation_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_binding_continuation_listContext optional_binding_continuation_list() throws RecognitionException {
		Optional_binding_continuation_listContext _localctx = new Optional_binding_continuation_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_optional_binding_continuation_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(COMMA);
			setState(681);
			optional_binding_head();
			setState(686);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(682);
					match(COMMA);
					setState(683);
					optional_binding_head();
					}
					} 
				}
				setState(688);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Repeat_while_statementContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Repeat_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRepeat_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRepeat_while_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRepeat_while_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeat_while_statementContext repeat_while_statement() throws RecognitionException {
		Repeat_while_statementContext _localctx = new Repeat_while_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_repeat_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			match(T__6);
			setState(690);
			code_block();
			setState(691);
			match(T__3);
			setState(692);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Branch_statementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Guard_statementContext guard_statement() {
			return getRuleContext(Guard_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public Branch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBranch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBranch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBranch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Branch_statementContext branch_statement() throws RecognitionException {
		Branch_statementContext _localctx = new Branch_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_branch_statement);
		try {
			setState(697);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				if_statement();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(695);
				guard_statement();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(696);
				switch_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public Condition_clauseContext condition_clause() {
			return getRuleContext(Condition_clauseContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(T__7);
			setState(700);
			condition_clause();
			setState(701);
			code_block();
			setState(703);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(702);
				else_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Else_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterElse_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitElse_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitElse_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_clauseContext else_clause() throws RecognitionException {
		Else_clauseContext _localctx = new Else_clauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_else_clause);
		try {
			setState(709);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				match(T__8);
				setState(706);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
				match(T__8);
				setState(708);
				if_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Guard_statementContext extends ParserRuleContext {
		public Condition_clauseContext condition_clause() {
			return getRuleContext(Condition_clauseContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Guard_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGuard_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGuard_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGuard_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Guard_statementContext guard_statement() throws RecognitionException {
		Guard_statementContext _localctx = new Guard_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_guard_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(T__9);
			setState(712);
			condition_clause();
			setState(713);
			match(T__8);
			setState(714);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Switch_casesContext switch_cases() {
			return getRuleContext(Switch_casesContext.class,0);
		}
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSwitch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSwitch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_switch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			match(T__10);
			setState(717);
			expression();
			setState(718);
			match(LCURLY);
			setState(720);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__11) {
				{
				setState(719);
				switch_cases();
				}
			}

			setState(722);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_casesContext extends ParserRuleContext {
		public Switch_caseContext switch_case() {
			return getRuleContext(Switch_caseContext.class,0);
		}
		public Switch_casesContext switch_cases() {
			return getRuleContext(Switch_casesContext.class,0);
		}
		public Switch_casesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_cases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSwitch_cases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSwitch_cases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSwitch_cases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_casesContext switch_cases() throws RecognitionException {
		Switch_casesContext _localctx = new Switch_casesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_switch_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			switch_case();
			setState(726);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__11) {
				{
				setState(725);
				switch_cases();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_caseContext extends ParserRuleContext {
		public Case_labelContext case_label() {
			return getRuleContext(Case_labelContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Default_labelContext default_label() {
			return getRuleContext(Default_labelContext.class,0);
		}
		public Switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSwitch_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSwitch_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSwitch_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_caseContext switch_case() throws RecognitionException {
		Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_switch_case);
		try {
			setState(734);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(728);
				case_label();
				setState(729);
				statements();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(731);
				default_label();
				setState(732);
				statements();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_labelContext extends ParserRuleContext {
		public Case_item_listContext case_item_list() {
			return getRuleContext(Case_item_listContext.class,0);
		}
		public Case_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCase_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCase_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCase_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_labelContext case_label() throws RecognitionException {
		Case_labelContext _localctx = new Case_labelContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_case_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			match(T__1);
			setState(737);
			case_item_list();
			setState(738);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_item_listContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Case_item_listContext case_item_list() {
			return getRuleContext(Case_item_listContext.class,0);
		}
		public Case_item_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_item_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCase_item_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCase_item_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCase_item_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_item_listContext case_item_list() throws RecognitionException {
		Case_item_listContext _localctx = new Case_item_listContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_case_item_list);
		int _la;
		try {
			setState(751);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(740);
				pattern(0);
				setState(742);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(741);
					where_clause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(744);
				pattern(0);
				setState(746);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(745);
					where_clause();
					}
				}

				setState(748);
				match(COMMA);
				setState(749);
				case_item_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_labelContext extends ParserRuleContext {
		public Default_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDefault_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDefault_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDefault_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_labelContext default_label() throws RecognitionException {
		Default_labelContext _localctx = new Default_labelContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_default_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(T__11);
			setState(754);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public Where_expressionContext where_expression() {
			return getRuleContext(Where_expressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(T__12);
			setState(757);
			where_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWhere_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWhere_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitWhere_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_expressionContext where_expression() throws RecognitionException {
		Where_expressionContext _localctx = new Where_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_where_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Labeled_statementContext extends ParserRuleContext {
		public Statement_labelContext statement_label() {
			return getRuleContext(Statement_labelContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public Labeled_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLabeled_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLabeled_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitLabeled_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Labeled_statementContext labeled_statement() throws RecognitionException {
		Labeled_statementContext _localctx = new Labeled_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_labeled_statement);
		try {
			setState(770);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				statement_label();
				setState(762);
				loop_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				statement_label();
				setState(765);
				if_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(767);
				statement_label();
				setState(768);
				switch_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_labelContext extends ParserRuleContext {
		public Label_nameContext label_name() {
			return getRuleContext(Label_nameContext.class,0);
		}
		public Statement_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStatement_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStatement_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitStatement_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_labelContext statement_label() throws RecognitionException {
		Statement_labelContext _localctx = new Statement_labelContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_statement_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			label_name();
			setState(773);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Label_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Label_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLabel_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLabel_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitLabel_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Label_nameContext label_name() throws RecognitionException {
		Label_nameContext _localctx = new Label_nameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_label_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Control_transfer_statementContext extends ParserRuleContext {
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public Continue_statementContext continue_statement() {
			return getRuleContext(Continue_statementContext.class,0);
		}
		public Fallthrough_statementContext fallthrough_statement() {
			return getRuleContext(Fallthrough_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Throw_statementContext throw_statement() {
			return getRuleContext(Throw_statementContext.class,0);
		}
		public Control_transfer_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_transfer_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterControl_transfer_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitControl_transfer_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitControl_transfer_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Control_transfer_statementContext control_transfer_statement() throws RecognitionException {
		Control_transfer_statementContext _localctx = new Control_transfer_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_control_transfer_statement);
		try {
			setState(782);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(777);
				break_statement();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(778);
				continue_statement();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(779);
				fallthrough_statement();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(780);
				return_statement();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(781);
				throw_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Break_statementContext extends ParserRuleContext {
		public Label_nameContext label_name() {
			return getRuleContext(Label_nameContext.class,0);
		}
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBreak_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBreak_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			match(T__13);
			setState(786);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(785);
				label_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Continue_statementContext extends ParserRuleContext {
		public Label_nameContext label_name() {
			return getRuleContext(Label_nameContext.class,0);
		}
		public Continue_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterContinue_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitContinue_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitContinue_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_statementContext continue_statement() throws RecognitionException {
		Continue_statementContext _localctx = new Continue_statementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_continue_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			match(T__14);
			setState(790);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(789);
				label_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fallthrough_statementContext extends ParserRuleContext {
		public Fallthrough_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fallthrough_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFallthrough_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFallthrough_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFallthrough_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fallthrough_statementContext fallthrough_statement() throws RecognitionException {
		Fallthrough_statementContext _localctx = new Fallthrough_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fallthrough_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			match(T__16);
			setState(796);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(795);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Availability_conditionContext extends ParserRuleContext {
		public Availability_argumentsContext availability_arguments() {
			return getRuleContext(Availability_argumentsContext.class,0);
		}
		public Availability_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availability_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAvailability_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAvailability_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAvailability_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Availability_conditionContext availability_condition() throws RecognitionException {
		Availability_conditionContext _localctx = new Availability_conditionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_availability_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(T__17);
			setState(799);
			match(LPAREN);
			setState(800);
			availability_arguments();
			setState(801);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Availability_argumentsContext extends ParserRuleContext {
		public List<Availability_argumentContext> availability_argument() {
			return getRuleContexts(Availability_argumentContext.class);
		}
		public Availability_argumentContext availability_argument(int i) {
			return getRuleContext(Availability_argumentContext.class,i);
		}
		public Availability_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availability_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAvailability_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAvailability_arguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAvailability_arguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Availability_argumentsContext availability_arguments() throws RecognitionException {
		Availability_argumentsContext _localctx = new Availability_argumentsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_availability_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			availability_argument();
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(804);
				match(COMMA);
				setState(805);
				availability_argument();
				}
				}
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Availability_argumentContext extends ParserRuleContext {
		public TerminalNode Platform() { return getToken(SwiftParser.Platform, 0); }
		public Availability_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availability_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAvailability_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAvailability_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAvailability_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Availability_argumentContext availability_argument() throws RecognitionException {
		Availability_argumentContext _localctx = new Availability_argumentContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_availability_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			_la = _input.LA(1);
			if ( !(_la==Platform || _la==MUL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Throw_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Throw_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throw_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterThrow_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitThrow_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitThrow_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Throw_statementContext throw_statement() throws RecognitionException {
		Throw_statementContext _localctx = new Throw_statementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_throw_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(T__18);
			setState(814);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Defer_statementContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Defer_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defer_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDefer_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDefer_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDefer_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Defer_statementContext defer_statement() throws RecognitionException {
		Defer_statementContext _localctx = new Defer_statementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_defer_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(T__19);
			setState(817);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_statementContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Catch_clausesContext catch_clauses() {
			return getRuleContext(Catch_clausesContext.class,0);
		}
		public Do_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDo_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDo_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDo_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_statementContext do_statement() throws RecognitionException {
		Do_statementContext _localctx = new Do_statementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_do_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			match(T__20);
			setState(820);
			code_block();
			setState(822);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(821);
				catch_clauses();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Catch_clausesContext extends ParserRuleContext {
		public Catch_clauseContext catch_clause() {
			return getRuleContext(Catch_clauseContext.class,0);
		}
		public Catch_clausesContext catch_clauses() {
			return getRuleContext(Catch_clausesContext.class,0);
		}
		public Catch_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCatch_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCatch_clauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCatch_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_clausesContext catch_clauses() throws RecognitionException {
		Catch_clausesContext _localctx = new Catch_clausesContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_catch_clauses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			catch_clause();
			setState(826);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(825);
				catch_clauses();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Catch_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Catch_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCatch_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCatch_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCatch_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_clauseContext catch_clause() throws RecognitionException {
		Catch_clauseContext _localctx = new Catch_clauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_catch_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(T__21);
			setState(830);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(829);
				pattern(0);
				}
				break;
			}
			setState(833);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(832);
				where_clause();
				}
			}

			setState(835);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compiler_control_statementContext extends ParserRuleContext {
		public Build_configuration_statementContext build_configuration_statement() {
			return getRuleContext(Build_configuration_statementContext.class,0);
		}
		public Line_control_statementContext line_control_statement() {
			return getRuleContext(Line_control_statementContext.class,0);
		}
		public Compiler_control_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compiler_control_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCompiler_control_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCompiler_control_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCompiler_control_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compiler_control_statementContext compiler_control_statement() throws RecognitionException {
		Compiler_control_statementContext _localctx = new Compiler_control_statementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_compiler_control_statement);
		try {
			setState(839);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(837);
				build_configuration_statement();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(838);
				line_control_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Build_configuration_statementContext extends ParserRuleContext {
		public Build_configurationContext build_configuration() {
			return getRuleContext(Build_configurationContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Build_configuration_elseif_clausesContext build_configuration_elseif_clauses() {
			return getRuleContext(Build_configuration_elseif_clausesContext.class,0);
		}
		public Build_configuration_else_clauseContext build_configuration_else_clause() {
			return getRuleContext(Build_configuration_else_clauseContext.class,0);
		}
		public Build_configuration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_configuration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBuild_configuration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBuild_configuration_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBuild_configuration_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_configuration_statementContext build_configuration_statement() throws RecognitionException {
		Build_configuration_statementContext _localctx = new Build_configuration_statementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_build_configuration_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			match(T__22);
			setState(842);
			build_configuration(0);
			setState(844);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(843);
				statements();
				}
				break;
			}
			setState(847);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(846);
				build_configuration_elseif_clauses();
				}
			}

			setState(850);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(849);
				build_configuration_else_clause();
				}
			}

			setState(852);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Build_configuration_elseif_clausesContext extends ParserRuleContext {
		public Build_configuration_elseif_clauseContext build_configuration_elseif_clause() {
			return getRuleContext(Build_configuration_elseif_clauseContext.class,0);
		}
		public Build_configuration_elseif_clausesContext build_configuration_elseif_clauses() {
			return getRuleContext(Build_configuration_elseif_clausesContext.class,0);
		}
		public Build_configuration_elseif_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_configuration_elseif_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBuild_configuration_elseif_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBuild_configuration_elseif_clauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBuild_configuration_elseif_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_configuration_elseif_clausesContext build_configuration_elseif_clauses() throws RecognitionException {
		Build_configuration_elseif_clausesContext _localctx = new Build_configuration_elseif_clausesContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_build_configuration_elseif_clauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			build_configuration_elseif_clause();
			setState(856);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(855);
				build_configuration_elseif_clauses();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Build_configuration_elseif_clauseContext extends ParserRuleContext {
		public Build_configurationContext build_configuration() {
			return getRuleContext(Build_configurationContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Build_configuration_elseif_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_configuration_elseif_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBuild_configuration_elseif_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBuild_configuration_elseif_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBuild_configuration_elseif_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_configuration_elseif_clauseContext build_configuration_elseif_clause() throws RecognitionException {
		Build_configuration_elseif_clauseContext _localctx = new Build_configuration_elseif_clauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_build_configuration_elseif_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			match(T__24);
			setState(859);
			build_configuration(0);
			setState(861);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(860);
				statements();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Build_configuration_else_clauseContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Build_configuration_else_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_configuration_else_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBuild_configuration_else_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBuild_configuration_else_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBuild_configuration_else_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_configuration_else_clauseContext build_configuration_else_clause() throws RecognitionException {
		Build_configuration_else_clauseContext _localctx = new Build_configuration_else_clauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_build_configuration_else_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			match(T__25);
			setState(865);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(864);
				statements();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Build_configurationContext extends ParserRuleContext {
		public List<Build_configurationContext> build_configuration() {
			return getRuleContexts(Build_configurationContext.class);
		}
		public Build_configurationContext build_configuration(int i) {
			return getRuleContext(Build_configurationContext.class,i);
		}
		public Platform_testing_functionContext platform_testing_function() {
			return getRuleContext(Platform_testing_functionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Build_ANDContext build_AND() {
			return getRuleContext(Build_ANDContext.class,0);
		}
		public Build_ORContext build_OR() {
			return getRuleContext(Build_ORContext.class,0);
		}
		public Build_configurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_configuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBuild_configuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBuild_configuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBuild_configuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_configurationContext build_configuration() throws RecognitionException {
		return build_configuration(0);
	}

	private Build_configurationContext build_configuration(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Build_configurationContext _localctx = new Build_configurationContext(_ctx, _parentState);
		Build_configurationContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_build_configuration, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			switch (_input.LA(1)) {
			case BANG:
				{
				setState(868);
				match(BANG);
				setState(869);
				build_configuration(3);
				}
				break;
			case T__26:
			case T__27:
				{
				setState(870);
				platform_testing_function();
				}
				break;
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__51:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__76:
			case T__79:
			case T__96:
			case T__97:
			case T__98:
			case Regular_identifier:
			case Implicit_parameter_name:
				{
				setState(871);
				identifier();
				}
				break;
			case T__99:
			case T__100:
				{
				setState(872);
				boolean_literal();
				}
				break;
			case LPAREN:
				{
				setState(873);
				match(LPAREN);
				setState(874);
				build_configuration(0);
				setState(875);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(889);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(887);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new Build_configurationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_build_configuration);
						setState(879);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(880);
						build_AND();
						setState(881);
						build_configuration(3);
						}
						break;
					case 2:
						{
						_localctx = new Build_configurationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_build_configuration);
						setState(883);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(884);
						build_OR();
						setState(885);
						build_configuration(2);
						}
						break;
					}
					} 
				}
				setState(891);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Platform_testing_functionContext extends ParserRuleContext {
		public Operating_systemContext operating_system() {
			return getRuleContext(Operating_systemContext.class,0);
		}
		public ArchitectureContext architecture() {
			return getRuleContext(ArchitectureContext.class,0);
		}
		public Platform_testing_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_platform_testing_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPlatform_testing_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPlatform_testing_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPlatform_testing_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Platform_testing_functionContext platform_testing_function() throws RecognitionException {
		Platform_testing_functionContext _localctx = new Platform_testing_functionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_platform_testing_function);
		try {
			setState(902);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(892);
				match(T__26);
				setState(893);
				match(LPAREN);
				setState(894);
				operating_system();
				setState(895);
				match(RPAREN);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(897);
				match(T__27);
				setState(898);
				match(LPAREN);
				setState(899);
				architecture();
				setState(900);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operating_systemContext extends ParserRuleContext {
		public Operating_systemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operating_system; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOperating_system(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOperating_system(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitOperating_system(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operating_systemContext operating_system() throws RecognitionException {
		Operating_systemContext _localctx = new Operating_systemContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_operating_system);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArchitectureContext extends ParserRuleContext {
		public ArchitectureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_architecture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArchitecture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArchitecture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitArchitecture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArchitectureContext architecture() throws RecognitionException {
		ArchitectureContext _localctx = new ArchitectureContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_architecture);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Line_control_statementContext extends ParserRuleContext {
		public Line_numberContext line_number() {
			return getRuleContext(Line_numberContext.class,0);
		}
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public Line_control_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_control_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLine_control_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLine_control_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitLine_control_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Line_control_statementContext line_control_statement() throws RecognitionException {
		Line_control_statementContext _localctx = new Line_control_statementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_line_control_statement);
		try {
			setState(913);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				match(T__36);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(909);
				match(T__36);
				setState(910);
				line_number();
				setState(911);
				file_name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Line_numberContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Line_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLine_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLine_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitLine_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Line_numberContext line_number() throws RecognitionException {
		Line_numberContext _localctx = new Line_numberContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_line_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			integer_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class File_nameContext extends ParserRuleContext {
		public TerminalNode Static_string_literal() { return getToken(SwiftParser.Static_string_literal, 0); }
		public File_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFile_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFile_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFile_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_nameContext file_name() throws RecognitionException {
		File_nameContext _localctx = new File_nameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_file_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			match(Static_string_literal);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_parameter_clauseContext extends ParserRuleContext {
		public Generic_parameter_listContext generic_parameter_list() {
			return getRuleContext(Generic_parameter_listContext.class,0);
		}
		public Requirement_clauseContext requirement_clause() {
			return getRuleContext(Requirement_clauseContext.class,0);
		}
		public Generic_parameter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_parameter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGeneric_parameter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGeneric_parameter_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGeneric_parameter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_parameter_clauseContext generic_parameter_clause() throws RecognitionException {
		Generic_parameter_clauseContext _localctx = new Generic_parameter_clauseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_generic_parameter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			match(LT);
			setState(920);
			generic_parameter_list();
			setState(922);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(921);
				requirement_clause();
				}
			}

			setState(924);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_parameter_listContext extends ParserRuleContext {
		public List<Generic_parameterContext> generic_parameter() {
			return getRuleContexts(Generic_parameterContext.class);
		}
		public Generic_parameterContext generic_parameter(int i) {
			return getRuleContext(Generic_parameterContext.class,i);
		}
		public Generic_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGeneric_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGeneric_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGeneric_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_parameter_listContext generic_parameter_list() throws RecognitionException {
		Generic_parameter_listContext _localctx = new Generic_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_generic_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			generic_parameter();
			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(927);
				match(COMMA);
				setState(928);
				generic_parameter();
				}
				}
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_parameterContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Protocol_composition_typeContext protocol_composition_type() {
			return getRuleContext(Protocol_composition_typeContext.class,0);
		}
		public Generic_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGeneric_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGeneric_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGeneric_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_parameterContext generic_parameter() throws RecognitionException {
		Generic_parameterContext _localctx = new Generic_parameterContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_generic_parameter);
		try {
			setState(943);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(934);
				type_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(935);
				type_name();
				setState(936);
				match(COLON);
				setState(937);
				type_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(939);
				type_name();
				setState(940);
				match(COLON);
				setState(941);
				protocol_composition_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Requirement_clauseContext extends ParserRuleContext {
		public Requirement_listContext requirement_list() {
			return getRuleContext(Requirement_listContext.class,0);
		}
		public Requirement_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRequirement_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRequirement_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRequirement_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Requirement_clauseContext requirement_clause() throws RecognitionException {
		Requirement_clauseContext _localctx = new Requirement_clauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_requirement_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			match(T__12);
			setState(946);
			requirement_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Requirement_listContext extends ParserRuleContext {
		public RequirementContext requirement() {
			return getRuleContext(RequirementContext.class,0);
		}
		public Requirement_listContext requirement_list() {
			return getRuleContext(Requirement_listContext.class,0);
		}
		public Requirement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRequirement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRequirement_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRequirement_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Requirement_listContext requirement_list() throws RecognitionException {
		Requirement_listContext _localctx = new Requirement_listContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_requirement_list);
		try {
			setState(953);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(948);
				requirement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(949);
				requirement();
				setState(950);
				match(COMMA);
				setState(951);
				requirement_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequirementContext extends ParserRuleContext {
		public Conformance_requirementContext conformance_requirement() {
			return getRuleContext(Conformance_requirementContext.class,0);
		}
		public Same_type_requirementContext same_type_requirement() {
			return getRuleContext(Same_type_requirementContext.class,0);
		}
		public RequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRequirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRequirement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRequirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequirementContext requirement() throws RecognitionException {
		RequirementContext _localctx = new RequirementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_requirement);
		try {
			setState(957);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(955);
				conformance_requirement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(956);
				same_type_requirement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conformance_requirementContext extends ParserRuleContext {
		public List<Type_identifierContext> type_identifier() {
			return getRuleContexts(Type_identifierContext.class);
		}
		public Type_identifierContext type_identifier(int i) {
			return getRuleContext(Type_identifierContext.class,i);
		}
		public Protocol_composition_typeContext protocol_composition_type() {
			return getRuleContext(Protocol_composition_typeContext.class,0);
		}
		public Conformance_requirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conformance_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterConformance_requirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitConformance_requirement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitConformance_requirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conformance_requirementContext conformance_requirement() throws RecognitionException {
		Conformance_requirementContext _localctx = new Conformance_requirementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_conformance_requirement);
		try {
			setState(967);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(959);
				type_identifier();
				setState(960);
				match(COLON);
				setState(961);
				type_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(963);
				type_identifier();
				setState(964);
				match(COLON);
				setState(965);
				protocol_composition_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Same_type_requirementContext extends ParserRuleContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Same_type_equalsContext same_type_equals() {
			return getRuleContext(Same_type_equalsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Same_type_requirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_same_type_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSame_type_requirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSame_type_requirement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSame_type_requirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Same_type_requirementContext same_type_requirement() throws RecognitionException {
		Same_type_requirementContext _localctx = new Same_type_requirementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_same_type_requirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			type_identifier();
			setState(970);
			same_type_equals();
			setState(971);
			type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_argument_clauseContext extends ParserRuleContext {
		public Generic_argument_listContext generic_argument_list() {
			return getRuleContext(Generic_argument_listContext.class,0);
		}
		public Generic_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_argument_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGeneric_argument_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGeneric_argument_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGeneric_argument_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_argument_clauseContext generic_argument_clause() throws RecognitionException {
		Generic_argument_clauseContext _localctx = new Generic_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_generic_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			match(LT);
			setState(974);
			generic_argument_list();
			setState(975);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_argument_listContext extends ParserRuleContext {
		public List<Generic_argumentContext> generic_argument() {
			return getRuleContexts(Generic_argumentContext.class);
		}
		public Generic_argumentContext generic_argument(int i) {
			return getRuleContext(Generic_argumentContext.class,i);
		}
		public Generic_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGeneric_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGeneric_argument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGeneric_argument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_argument_listContext generic_argument_list() throws RecognitionException {
		Generic_argument_listContext _localctx = new Generic_argument_listContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_generic_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			generic_argument();
			setState(982);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(978);
				match(COMMA);
				setState(979);
				generic_argument();
				}
				}
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_argumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Generic_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGeneric_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGeneric_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGeneric_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_argumentContext generic_argument() throws RecognitionException {
		Generic_argumentContext _localctx = new Generic_argumentContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_generic_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Import_declarationContext import_declaration() {
			return getRuleContext(Import_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Typealias_declarationContext typealias_declaration() {
			return getRuleContext(Typealias_declarationContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Enum_declarationContext enum_declaration() {
			return getRuleContext(Enum_declarationContext.class,0);
		}
		public Struct_declarationContext struct_declaration() {
			return getRuleContext(Struct_declarationContext.class,0);
		}
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public Protocol_declarationContext protocol_declaration() {
			return getRuleContext(Protocol_declarationContext.class,0);
		}
		public Initializer_declarationContext initializer_declaration() {
			return getRuleContext(Initializer_declarationContext.class,0);
		}
		public Deinitializer_declarationContext deinitializer_declaration() {
			return getRuleContext(Deinitializer_declarationContext.class,0);
		}
		public Extension_declarationContext extension_declaration() {
			return getRuleContext(Extension_declarationContext.class,0);
		}
		public Subscript_declarationContext subscript_declaration() {
			return getRuleContext(Subscript_declarationContext.class,0);
		}
		public Operator_declarationContext operator_declaration() {
			return getRuleContext(Operator_declarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_declaration);
		try {
			setState(1001);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(987);
				import_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(988);
				constant_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(989);
				variable_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(990);
				typealias_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(991);
				function_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(992);
				enum_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(993);
				struct_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(994);
				class_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(995);
				protocol_declaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(996);
				initializer_declaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(997);
				deinitializer_declaration();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(998);
				extension_declaration();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(999);
				subscript_declaration();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1000);
				operator_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1003);
				declaration();
				}
				}
				setState(1006); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (Regular_identifier - 64)) | (1L << (AT - 64)))) != 0) || _la==Implicit_parameter_name );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Top_level_declarationContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Top_level_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_level_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTop_level_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTop_level_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTop_level_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Top_level_declarationContext top_level_declaration() throws RecognitionException {
		Top_level_declarationContext _localctx = new Top_level_declarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_top_level_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(1008);
				statements();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Code_blockContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCode_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCode_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCode_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_code_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			match(LCURLY);
			setState(1013);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(1012);
				statements();
				}
				break;
			}
			setState(1015);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_declarationContext extends ParserRuleContext {
		public Import_pathContext import_path() {
			return getRuleContext(Import_pathContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Import_kindContext import_kind() {
			return getRuleContext(Import_kindContext.class,0);
		}
		public Import_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImport_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImport_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitImport_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_declarationContext import_declaration() throws RecognitionException {
		Import_declarationContext _localctx = new Import_declarationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_import_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__51 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__74 - 45)) | (1L << (T__76 - 45)) | (1L << (T__79 - 45)) | (1L << (T__96 - 45)) | (1L << (T__97 - 45)) | (1L << (T__98 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==AT || _la==Implicit_parameter_name) {
				{
				setState(1017);
				attributes();
				}
			}

			setState(1020);
			match(T__37);
			setState(1022);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) {
				{
				setState(1021);
				import_kind();
				}
			}

			setState(1024);
			import_path();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_kindContext extends ParserRuleContext {
		public Import_kindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_kind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImport_kind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImport_kind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitImport_kind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_kindContext import_kind() throws RecognitionException {
		Import_kindContext _localctx = new Import_kindContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_import_kind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_pathContext extends ParserRuleContext {
		public Import_path_identifierContext import_path_identifier() {
			return getRuleContext(Import_path_identifierContext.class,0);
		}
		public Import_pathContext import_path() {
			return getRuleContext(Import_pathContext.class,0);
		}
		public Import_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImport_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImport_path(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitImport_path(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_pathContext import_path() throws RecognitionException {
		Import_pathContext _localctx = new Import_pathContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_import_path);
		try {
			setState(1033);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1028);
				import_path_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1029);
				import_path_identifier();
				setState(1030);
				match(DOT);
				setState(1031);
				import_path();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_path_identifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Import_path_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_path_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImport_path_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImport_path_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitImport_path_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_path_identifierContext import_path_identifier() throws RecognitionException {
		Import_path_identifierContext _localctx = new Import_path_identifierContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_import_path_identifier);
		try {
			setState(1037);
			switch (_input.LA(1)) {
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__51:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__76:
			case T__79:
			case T__96:
			case T__97:
			case T__98:
			case Regular_identifier:
			case Implicit_parameter_name:
				enterOuterAlt(_localctx, 1);
				{
				setState(1035);
				identifier();
				}
				break;
			case DOT:
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
			case Operator_head_other:
				enterOuterAlt(_localctx, 2);
				{
				setState(1036);
				operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_declarationContext extends ParserRuleContext {
		public Pattern_initializer_listContext pattern_initializer_list() {
			return getRuleContext(Pattern_initializer_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterConstant_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitConstant_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitConstant_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_constant_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(1039);
				attributes();
				}
				break;
			}
			setState(1043);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__57 - 41)) | (1L << (T__59 - 41)) | (1L << (T__60 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__76 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)) | (1L << (T__82 - 41)))) != 0)) {
				{
				setState(1042);
				declaration_modifiers();
				}
			}

			setState(1045);
			match(T__4);
			setState(1046);
			pattern_initializer_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pattern_initializer_listContext extends ParserRuleContext {
		public List<Pattern_initializerContext> pattern_initializer() {
			return getRuleContexts(Pattern_initializerContext.class);
		}
		public Pattern_initializerContext pattern_initializer(int i) {
			return getRuleContext(Pattern_initializerContext.class,i);
		}
		public Pattern_initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPattern_initializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPattern_initializer_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPattern_initializer_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_initializer_listContext pattern_initializer_list() throws RecognitionException {
		Pattern_initializer_listContext _localctx = new Pattern_initializer_listContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_pattern_initializer_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			pattern_initializer();
			setState(1053);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1049);
					match(COMMA);
					setState(1050);
					pattern_initializer();
					}
					} 
				}
				setState(1055);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pattern_initializerContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Pattern_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPattern_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPattern_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPattern_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_initializerContext pattern_initializer() throws RecognitionException {
		Pattern_initializerContext _localctx = new Pattern_initializerContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_pattern_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			pattern(0);
			setState(1058);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(1057);
				initializer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			assignment_operator();
			setState(1061);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declarationContext extends ParserRuleContext {
		public Variable_declaration_headContext variable_declaration_head() {
			return getRuleContext(Variable_declaration_headContext.class,0);
		}
		public Pattern_initializer_listContext pattern_initializer_list() {
			return getRuleContext(Pattern_initializer_listContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public List<Type_annotationContext> type_annotation() {
			return getRuleContexts(Type_annotationContext.class);
		}
		public Type_annotationContext type_annotation(int i) {
			return getRuleContext(Type_annotationContext.class,i);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Getter_setter_blockContext getter_setter_block() {
			return getRuleContext(Getter_setter_blockContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public WillSet_didSet_blockContext willSet_didSet_block() {
			return getRuleContext(WillSet_didSet_blockContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_variable_declaration);
		try {
			setState(1098);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1063);
				variable_declaration_head();
				setState(1064);
				pattern_initializer_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1066);
				variable_declaration_head();
				setState(1067);
				variable_name();
				setState(1068);
				type_annotation();
				setState(1069);
				code_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1071);
				variable_declaration_head();
				setState(1072);
				variable_name();
				setState(1073);
				type_annotation();
				setState(1074);
				getter_setter_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1076);
				variable_declaration_head();
				setState(1077);
				variable_name();
				setState(1078);
				type_annotation();
				setState(1079);
				getter_setter_keyword_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1081);
				variable_declaration_head();
				setState(1082);
				variable_name();
				setState(1083);
				type_annotation();
				setState(1085);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(1084);
					initializer();
					}
					break;
				}
				setState(1087);
				willSet_didSet_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1089);
				variable_declaration_head();
				setState(1090);
				variable_name();
				setState(1091);
				type_annotation();
				setState(1092);
				type_annotation();
				setState(1094);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(1093);
					initializer();
					}
					break;
				}
				setState(1096);
				willSet_didSet_block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declaration_headContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Variable_declaration_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterVariable_declaration_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitVariable_declaration_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitVariable_declaration_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declaration_headContext variable_declaration_head() throws RecognitionException {
		Variable_declaration_headContext _localctx = new Variable_declaration_headContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_variable_declaration_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(1100);
				attributes();
				}
				break;
			}
			setState(1104);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__57 - 41)) | (1L << (T__59 - 41)) | (1L << (T__60 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__76 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)) | (1L << (T__82 - 41)))) != 0)) {
				{
				setState(1103);
				declaration_modifiers();
				}
			}

			setState(1106);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterVariable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitVariable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitVariable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Getter_setter_blockContext extends ParserRuleContext {
		public Getter_clauseContext getter_clause() {
			return getRuleContext(Getter_clauseContext.class,0);
		}
		public Setter_clauseContext setter_clause() {
			return getRuleContext(Setter_clauseContext.class,0);
		}
		public Getter_setter_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_setter_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGetter_setter_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGetter_setter_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGetter_setter_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getter_setter_blockContext getter_setter_block() throws RecognitionException {
		Getter_setter_blockContext _localctx = new Getter_setter_blockContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_getter_setter_block);
		int _la;
		try {
			setState(1122);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1110);
				match(LCURLY);
				setState(1111);
				getter_clause();
				setState(1113);
				_la = _input.LA(1);
				if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__51 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__74 - 45)) | (1L << (T__76 - 45)) | (1L << (T__79 - 45)) | (1L << (T__96 - 45)) | (1L << (T__97 - 45)) | (1L << (T__98 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==AT || _la==Implicit_parameter_name) {
					{
					setState(1112);
					setter_clause();
					}
				}

				setState(1115);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1117);
				match(LCURLY);
				setState(1118);
				setter_clause();
				setState(1119);
				getter_clause();
				setState(1120);
				match(RCURLY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Getter_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Getter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGetter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGetter_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGetter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getter_clauseContext getter_clause() throws RecognitionException {
		Getter_clauseContext _localctx = new Getter_clauseContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_getter_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1125);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(1124);
				attributes();
				}
				break;
			}
			setState(1127);
			match(T__44);
			setState(1128);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Setter_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Setter_nameContext setter_name() {
			return getRuleContext(Setter_nameContext.class,0);
		}
		public Setter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSetter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSetter_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSetter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Setter_clauseContext setter_clause() throws RecognitionException {
		Setter_clauseContext _localctx = new Setter_clauseContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_setter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(1130);
				attributes();
				}
				break;
			}
			setState(1133);
			match(T__45);
			setState(1135);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1134);
				setter_name();
				}
			}

			setState(1137);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Setter_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Setter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSetter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSetter_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSetter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Setter_nameContext setter_name() throws RecognitionException {
		Setter_nameContext _localctx = new Setter_nameContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_setter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			match(LPAREN);
			setState(1140);
			identifier();
			setState(1141);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Getter_setter_keyword_blockContext extends ParserRuleContext {
		public Getter_keyword_clauseContext getter_keyword_clause() {
			return getRuleContext(Getter_keyword_clauseContext.class,0);
		}
		public Setter_keyword_clauseContext setter_keyword_clause() {
			return getRuleContext(Setter_keyword_clauseContext.class,0);
		}
		public Getter_setter_keyword_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_setter_keyword_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGetter_setter_keyword_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGetter_setter_keyword_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGetter_setter_keyword_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getter_setter_keyword_blockContext getter_setter_keyword_block() throws RecognitionException {
		Getter_setter_keyword_blockContext _localctx = new Getter_setter_keyword_blockContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_getter_setter_keyword_block);
		int _la;
		try {
			setState(1155);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1143);
				match(LCURLY);
				setState(1144);
				getter_keyword_clause();
				setState(1146);
				_la = _input.LA(1);
				if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__51 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__74 - 45)) | (1L << (T__76 - 45)) | (1L << (T__79 - 45)) | (1L << (T__96 - 45)) | (1L << (T__97 - 45)) | (1L << (T__98 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==AT || _la==Implicit_parameter_name) {
					{
					setState(1145);
					setter_keyword_clause();
					}
				}

				setState(1148);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1150);
				match(LCURLY);
				setState(1151);
				setter_keyword_clause();
				setState(1152);
				getter_keyword_clause();
				setState(1153);
				match(RCURLY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Getter_keyword_clauseContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Getter_keyword_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_keyword_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGetter_keyword_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGetter_keyword_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGetter_keyword_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getter_keyword_clauseContext getter_keyword_clause() throws RecognitionException {
		Getter_keyword_clauseContext _localctx = new Getter_keyword_clauseContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_getter_keyword_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1158);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(1157);
				attributes();
				}
				break;
			}
			setState(1160);
			match(T__44);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Setter_keyword_clauseContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Setter_keyword_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_keyword_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSetter_keyword_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSetter_keyword_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSetter_keyword_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Setter_keyword_clauseContext setter_keyword_clause() throws RecognitionException {
		Setter_keyword_clauseContext _localctx = new Setter_keyword_clauseContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_setter_keyword_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1163);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(1162);
				attributes();
				}
				break;
			}
			setState(1165);
			match(T__45);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WillSet_didSet_blockContext extends ParserRuleContext {
		public WillSet_clauseContext willSet_clause() {
			return getRuleContext(WillSet_clauseContext.class,0);
		}
		public DidSet_clauseContext didSet_clause() {
			return getRuleContext(DidSet_clauseContext.class,0);
		}
		public WillSet_didSet_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_willSet_didSet_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWillSet_didSet_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWillSet_didSet_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitWillSet_didSet_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WillSet_didSet_blockContext willSet_didSet_block() throws RecognitionException {
		WillSet_didSet_blockContext _localctx = new WillSet_didSet_blockContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_willSet_didSet_block);
		int _la;
		try {
			setState(1179);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1167);
				match(LCURLY);
				setState(1168);
				willSet_clause();
				setState(1170);
				_la = _input.LA(1);
				if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__51 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__74 - 45)) | (1L << (T__76 - 45)) | (1L << (T__79 - 45)) | (1L << (T__96 - 45)) | (1L << (T__97 - 45)) | (1L << (T__98 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==AT || _la==Implicit_parameter_name) {
					{
					setState(1169);
					didSet_clause();
					}
				}

				setState(1172);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1174);
				match(LCURLY);
				setState(1175);
				didSet_clause();
				setState(1176);
				willSet_clause();
				setState(1177);
				match(RCURLY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WillSet_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Setter_nameContext setter_name() {
			return getRuleContext(Setter_nameContext.class,0);
		}
		public WillSet_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_willSet_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWillSet_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWillSet_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitWillSet_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WillSet_clauseContext willSet_clause() throws RecognitionException {
		WillSet_clauseContext _localctx = new WillSet_clauseContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_willSet_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(1181);
				attributes();
				}
				break;
			}
			setState(1184);
			match(T__46);
			setState(1186);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1185);
				setter_name();
				}
			}

			setState(1188);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DidSet_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Setter_nameContext setter_name() {
			return getRuleContext(Setter_nameContext.class,0);
		}
		public DidSet_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_didSet_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDidSet_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDidSet_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDidSet_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DidSet_clauseContext didSet_clause() throws RecognitionException {
		DidSet_clauseContext _localctx = new DidSet_clauseContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_didSet_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(1190);
				attributes();
				}
				break;
			}
			setState(1193);
			match(T__47);
			setState(1195);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1194);
				setter_name();
				}
			}

			setState(1197);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typealias_declarationContext extends ParserRuleContext {
		public Typealias_headContext typealias_head() {
			return getRuleContext(Typealias_headContext.class,0);
		}
		public Typealias_assignmentContext typealias_assignment() {
			return getRuleContext(Typealias_assignmentContext.class,0);
		}
		public Typealias_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypealias_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypealias_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTypealias_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typealias_declarationContext typealias_declaration() throws RecognitionException {
		Typealias_declarationContext _localctx = new Typealias_declarationContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_typealias_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			typealias_head();
			setState(1200);
			typealias_assignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typealias_headContext extends ParserRuleContext {
		public Typealias_nameContext typealias_name() {
			return getRuleContext(Typealias_nameContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Typealias_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypealias_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypealias_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTypealias_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typealias_headContext typealias_head() throws RecognitionException {
		Typealias_headContext _localctx = new Typealias_headContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_typealias_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__51 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__74 - 45)) | (1L << (T__76 - 45)) | (1L << (T__79 - 45)) | (1L << (T__96 - 45)) | (1L << (T__97 - 45)) | (1L << (T__98 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==AT || _la==Implicit_parameter_name) {
				{
				setState(1202);
				attributes();
				}
			}

			setState(1206);
			_la = _input.LA(1);
			if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)))) != 0)) {
				{
				setState(1205);
				access_level_modifier();
				}
			}

			setState(1208);
			match(T__38);
			setState(1209);
			typealias_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typealias_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Typealias_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypealias_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypealias_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTypealias_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typealias_nameContext typealias_name() throws RecognitionException {
		Typealias_nameContext _localctx = new Typealias_nameContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_typealias_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typealias_assignmentContext extends ParserRuleContext {
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Typealias_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypealias_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypealias_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTypealias_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typealias_assignmentContext typealias_assignment() throws RecognitionException {
		Typealias_assignmentContext _localctx = new Typealias_assignmentContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_typealias_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			assignment_operator();
			setState(1214);
			type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_declarationContext extends ParserRuleContext {
		public Function_headContext function_head() {
			return getRuleContext(Function_headContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_signatureContext function_signature() {
			return getRuleContext(Function_signatureContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			function_head();
			setState(1217);
			function_name();
			setState(1219);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1218);
				generic_parameter_clause();
				}
			}

			setState(1221);
			function_signature();
			setState(1223);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(1222);
				function_body();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_headContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Function_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunction_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunction_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFunction_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_headContext function_head() throws RecognitionException {
		Function_headContext _localctx = new Function_headContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_function_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(1225);
				attributes();
				}
				break;
			}
			setState(1229);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__57 - 41)) | (1L << (T__59 - 41)) | (1L << (T__60 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__76 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)) | (1L << (T__82 - 41)))) != 0)) {
				{
				setState(1228);
				declaration_modifiers();
				}
			}

			setState(1231);
			match(T__43);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_function_name);
		try {
			setState(1235);
			switch (_input.LA(1)) {
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__51:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__76:
			case T__79:
			case T__96:
			case T__97:
			case T__98:
			case Regular_identifier:
			case Implicit_parameter_name:
				enterOuterAlt(_localctx, 1);
				{
				setState(1233);
				identifier();
				}
				break;
			case DOT:
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
			case Operator_head_other:
				enterOuterAlt(_localctx, 2);
				{
				setState(1234);
				operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_signatureContext extends ParserRuleContext {
		public Parameter_clausesContext parameter_clauses() {
			return getRuleContext(Parameter_clausesContext.class,0);
		}
		public Function_resultContext function_result() {
			return getRuleContext(Function_resultContext.class,0);
		}
		public Function_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunction_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunction_signature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFunction_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_signatureContext function_signature() throws RecognitionException {
		Function_signatureContext _localctx = new Function_signatureContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_function_signature);
		try {
			setState(1249);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1237);
				parameter_clauses();
				setState(1239);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(1238);
					match(T__48);
					}
					break;
				}
				setState(1242);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1241);
					function_result();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1244);
				parameter_clauses();
				setState(1245);
				match(T__49);
				setState(1247);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(1246);
					function_result();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_resultContext extends ParserRuleContext {
		public Arrow_operatorContext arrow_operator() {
			return getRuleContext(Arrow_operatorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Function_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunction_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunction_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFunction_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_resultContext function_result() throws RecognitionException {
		Function_resultContext _localctx = new Function_resultContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_function_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			arrow_operator();
			setState(1253);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1252);
				attributes();
				}
				break;
			}
			setState(1255);
			type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_bodyContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1257);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_clausesContext extends ParserRuleContext {
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public Parameter_clausesContext parameter_clauses() {
			return getRuleContext(Parameter_clausesContext.class,0);
		}
		public Parameter_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterParameter_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitParameter_clauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitParameter_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_clausesContext parameter_clauses() throws RecognitionException {
		Parameter_clausesContext _localctx = new Parameter_clausesContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_parameter_clauses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			parameter_clause();
			setState(1261);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1260);
				parameter_clauses();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_clauseContext extends ParserRuleContext {
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Parameter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterParameter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitParameter_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitParameter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_clauseContext parameter_clause() throws RecognitionException {
		Parameter_clauseContext _localctx = new Parameter_clauseContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_parameter_clause);
		try {
			setState(1269);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1263);
				match(LPAREN);
				setState(1264);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1265);
				match(LPAREN);
				setState(1266);
				parameter_list();
				setState(1267);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_listContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
			parameter();
			setState(1276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1272);
				match(COMMA);
				setState(1273);
				parameter();
				}
				}
				setState(1278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public Local_parameter_nameContext local_parameter_name() {
			return getRuleContext(Local_parameter_nameContext.class,0);
		}
		public External_parameter_nameContext external_parameter_name() {
			return getRuleContext(External_parameter_nameContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Default_argument_clauseContext default_argument_clause() {
			return getRuleContext(Default_argument_clauseContext.class,0);
		}
		public Range_operatorContext range_operator() {
			return getRuleContext(Range_operatorContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_parameter);
		int _la;
		try {
			setState(1317);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1280);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(1279);
					match(T__4);
					}
				}

				setState(1283);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(1282);
					external_parameter_name();
					}
					break;
				}
				setState(1285);
				local_parameter_name();
				setState(1287);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1286);
					type_annotation();
					}
					break;
				}
				setState(1290);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1289);
					default_argument_clause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1292);
				match(T__5);
				setState(1294);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1293);
					external_parameter_name();
					}
					break;
				}
				setState(1296);
				local_parameter_name();
				setState(1298);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(1297);
					type_annotation();
					}
					break;
				}
				setState(1301);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1300);
					default_argument_clause();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1303);
				match(T__50);
				setState(1305);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1304);
					external_parameter_name();
					}
					break;
				}
				setState(1307);
				local_parameter_name();
				setState(1308);
				type_annotation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1311);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1310);
					external_parameter_name();
					}
					break;
				}
				setState(1313);
				local_parameter_name();
				setState(1314);
				type_annotation();
				setState(1315);
				range_operator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class External_parameter_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public External_parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_parameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExternal_parameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExternal_parameter_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExternal_parameter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final External_parameter_nameContext external_parameter_name() throws RecognitionException {
		External_parameter_nameContext _localctx = new External_parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_external_parameter_name);
		try {
			setState(1321);
			switch (_input.LA(1)) {
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__51:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__76:
			case T__79:
			case T__96:
			case T__97:
			case T__98:
			case Regular_identifier:
			case Implicit_parameter_name:
				enterOuterAlt(_localctx, 1);
				{
				setState(1319);
				identifier();
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1320);
				match(UNDERSCORE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_parameter_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Local_parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_parameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLocal_parameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLocal_parameter_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitLocal_parameter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_parameter_nameContext local_parameter_name() throws RecognitionException {
		Local_parameter_nameContext _localctx = new Local_parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_local_parameter_name);
		try {
			setState(1325);
			switch (_input.LA(1)) {
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__51:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__76:
			case T__79:
			case T__96:
			case T__97:
			case T__98:
			case Regular_identifier:
			case Implicit_parameter_name:
				enterOuterAlt(_localctx, 1);
				{
				setState(1323);
				identifier();
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1324);
				match(UNDERSCORE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_argument_clauseContext extends ParserRuleContext {
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Default_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_argument_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDefault_argument_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDefault_argument_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDefault_argument_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_argument_clauseContext default_argument_clause() throws RecognitionException {
		Default_argument_clauseContext _localctx = new Default_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_default_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
			assignment_operator();
			setState(1328);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_declarationContext extends ParserRuleContext {
		public Union_style_enumContext union_style_enum() {
			return getRuleContext(Union_style_enumContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Raw_value_style_enumContext raw_value_style_enum() {
			return getRuleContext(Raw_value_style_enumContext.class,0);
		}
		public Enum_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterEnum_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitEnum_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitEnum_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_declarationContext enum_declaration() throws RecognitionException {
		Enum_declarationContext _localctx = new Enum_declarationContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_enum_declaration);
		int _la;
		try {
			setState(1344);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1331);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(1330);
					attributes();
					}
					break;
				}
				setState(1334);
				_la = _input.LA(1);
				if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)))) != 0)) {
					{
					setState(1333);
					access_level_modifier();
					}
				}

				setState(1336);
				union_style_enum();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1338);
				_la = _input.LA(1);
				if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__51 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__74 - 45)) | (1L << (T__76 - 45)) | (1L << (T__79 - 45)) | (1L << (T__96 - 45)) | (1L << (T__97 - 45)) | (1L << (T__98 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==AT || _la==Implicit_parameter_name) {
					{
					setState(1337);
					attributes();
					}
				}

				setState(1341);
				_la = _input.LA(1);
				if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)))) != 0)) {
					{
					setState(1340);
					access_level_modifier();
					}
				}

				setState(1343);
				raw_value_style_enum();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_style_enumContext extends ParserRuleContext {
		public Enum_nameContext enum_name() {
			return getRuleContext(Enum_nameContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Union_style_enum_membersContext union_style_enum_members() {
			return getRuleContext(Union_style_enum_membersContext.class,0);
		}
		public Union_style_enumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnion_style_enum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnion_style_enum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitUnion_style_enum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enumContext union_style_enum() throws RecognitionException {
		Union_style_enumContext _localctx = new Union_style_enumContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_union_style_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347);
			_la = _input.LA(1);
			if (_la==T__51) {
				{
				setState(1346);
				match(T__51);
				}
			}

			setState(1349);
			match(T__41);
			setState(1350);
			enum_name();
			setState(1352);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1351);
				generic_parameter_clause();
				}
			}

			setState(1355);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1354);
				type_inheritance_clause();
				}
			}

			setState(1357);
			match(LCURLY);
			setState(1359);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (Regular_identifier - 64)) | (1L << (AT - 64)))) != 0) || _la==Implicit_parameter_name) {
				{
				setState(1358);
				union_style_enum_members();
				}
			}

			setState(1361);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_style_enum_membersContext extends ParserRuleContext {
		public Union_style_enum_memberContext union_style_enum_member() {
			return getRuleContext(Union_style_enum_memberContext.class,0);
		}
		public Union_style_enum_membersContext union_style_enum_members() {
			return getRuleContext(Union_style_enum_membersContext.class,0);
		}
		public Union_style_enum_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnion_style_enum_members(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnion_style_enum_members(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitUnion_style_enum_members(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_membersContext union_style_enum_members() throws RecognitionException {
		Union_style_enum_membersContext _localctx = new Union_style_enum_membersContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_union_style_enum_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			union_style_enum_member();
			setState(1365);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (Regular_identifier - 64)) | (1L << (AT - 64)))) != 0) || _la==Implicit_parameter_name) {
				{
				setState(1364);
				union_style_enum_members();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_style_enum_memberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Union_style_enum_case_clauseContext union_style_enum_case_clause() {
			return getRuleContext(Union_style_enum_case_clauseContext.class,0);
		}
		public Union_style_enum_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnion_style_enum_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnion_style_enum_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitUnion_style_enum_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_memberContext union_style_enum_member() throws RecognitionException {
		Union_style_enum_memberContext _localctx = new Union_style_enum_memberContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_union_style_enum_member);
		try {
			setState(1369);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1367);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1368);
				union_style_enum_case_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_style_enum_case_clauseContext extends ParserRuleContext {
		public Union_style_enum_case_listContext union_style_enum_case_list() {
			return getRuleContext(Union_style_enum_case_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Union_style_enum_case_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_case_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnion_style_enum_case_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnion_style_enum_case_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitUnion_style_enum_case_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_case_clauseContext union_style_enum_case_clause() throws RecognitionException {
		Union_style_enum_case_clauseContext _localctx = new Union_style_enum_case_clauseContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_union_style_enum_case_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1372);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1371);
				attributes();
				}
				break;
			}
			setState(1375);
			_la = _input.LA(1);
			if (_la==T__51) {
				{
				setState(1374);
				match(T__51);
				}
			}

			setState(1377);
			match(T__1);
			setState(1378);
			union_style_enum_case_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_style_enum_case_listContext extends ParserRuleContext {
		public Union_style_enum_caseContext union_style_enum_case() {
			return getRuleContext(Union_style_enum_caseContext.class,0);
		}
		public Union_style_enum_case_listContext union_style_enum_case_list() {
			return getRuleContext(Union_style_enum_case_listContext.class,0);
		}
		public Union_style_enum_case_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_case_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnion_style_enum_case_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnion_style_enum_case_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitUnion_style_enum_case_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_case_listContext union_style_enum_case_list() throws RecognitionException {
		Union_style_enum_case_listContext _localctx = new Union_style_enum_case_listContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_union_style_enum_case_list);
		try {
			setState(1385);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1380);
				union_style_enum_case();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1381);
				union_style_enum_case();
				setState(1382);
				match(COMMA);
				setState(1383);
				union_style_enum_case_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_style_enum_caseContext extends ParserRuleContext {
		public Enum_case_nameContext enum_case_name() {
			return getRuleContext(Enum_case_nameContext.class,0);
		}
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public Union_style_enum_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnion_style_enum_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnion_style_enum_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitUnion_style_enum_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_caseContext union_style_enum_case() throws RecognitionException {
		Union_style_enum_caseContext _localctx = new Union_style_enum_caseContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_union_style_enum_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1387);
			enum_case_name();
			setState(1389);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1388);
				tuple_type();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Enum_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterEnum_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitEnum_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitEnum_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_nameContext enum_name() throws RecognitionException {
		Enum_nameContext _localctx = new Enum_nameContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_enum_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_case_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Enum_case_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_case_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterEnum_case_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitEnum_case_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitEnum_case_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_case_nameContext enum_case_name() throws RecognitionException {
		Enum_case_nameContext _localctx = new Enum_case_nameContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_enum_case_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1393);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_style_enumContext extends ParserRuleContext {
		public Enum_nameContext enum_name() {
			return getRuleContext(Enum_nameContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Raw_value_style_enum_membersContext raw_value_style_enum_members() {
			return getRuleContext(Raw_value_style_enum_membersContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Raw_value_style_enumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRaw_value_style_enum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRaw_value_style_enum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRaw_value_style_enum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enumContext raw_value_style_enum() throws RecognitionException {
		Raw_value_style_enumContext _localctx = new Raw_value_style_enumContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_raw_value_style_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1395);
			match(T__41);
			setState(1396);
			enum_name();
			setState(1398);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1397);
				generic_parameter_clause();
				}
			}

			setState(1400);
			type_inheritance_clause();
			setState(1401);
			match(LCURLY);
			setState(1402);
			raw_value_style_enum_members();
			setState(1403);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_style_enum_membersContext extends ParserRuleContext {
		public Raw_value_style_enum_memberContext raw_value_style_enum_member() {
			return getRuleContext(Raw_value_style_enum_memberContext.class,0);
		}
		public Raw_value_style_enum_membersContext raw_value_style_enum_members() {
			return getRuleContext(Raw_value_style_enum_membersContext.class,0);
		}
		public Raw_value_style_enum_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRaw_value_style_enum_members(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRaw_value_style_enum_members(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRaw_value_style_enum_members(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_membersContext raw_value_style_enum_members() throws RecognitionException {
		Raw_value_style_enum_membersContext _localctx = new Raw_value_style_enum_membersContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_raw_value_style_enum_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
			raw_value_style_enum_member();
			setState(1407);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (Regular_identifier - 64)) | (1L << (AT - 64)))) != 0) || _la==Implicit_parameter_name) {
				{
				setState(1406);
				raw_value_style_enum_members();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_style_enum_memberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Raw_value_style_enum_case_clauseContext raw_value_style_enum_case_clause() {
			return getRuleContext(Raw_value_style_enum_case_clauseContext.class,0);
		}
		public Raw_value_style_enum_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRaw_value_style_enum_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRaw_value_style_enum_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRaw_value_style_enum_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_memberContext raw_value_style_enum_member() throws RecognitionException {
		Raw_value_style_enum_memberContext _localctx = new Raw_value_style_enum_memberContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_raw_value_style_enum_member);
		try {
			setState(1411);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1409);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1410);
				raw_value_style_enum_case_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_style_enum_case_clauseContext extends ParserRuleContext {
		public Raw_value_style_enum_case_listContext raw_value_style_enum_case_list() {
			return getRuleContext(Raw_value_style_enum_case_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Raw_value_style_enum_case_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_case_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRaw_value_style_enum_case_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRaw_value_style_enum_case_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRaw_value_style_enum_case_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_case_clauseContext raw_value_style_enum_case_clause() throws RecognitionException {
		Raw_value_style_enum_case_clauseContext _localctx = new Raw_value_style_enum_case_clauseContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_raw_value_style_enum_case_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1414);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__51 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__74 - 45)) | (1L << (T__76 - 45)) | (1L << (T__79 - 45)) | (1L << (T__96 - 45)) | (1L << (T__97 - 45)) | (1L << (T__98 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==AT || _la==Implicit_parameter_name) {
				{
				setState(1413);
				attributes();
				}
			}

			setState(1416);
			match(T__1);
			setState(1417);
			raw_value_style_enum_case_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_style_enum_case_listContext extends ParserRuleContext {
		public Raw_value_style_enum_caseContext raw_value_style_enum_case() {
			return getRuleContext(Raw_value_style_enum_caseContext.class,0);
		}
		public Raw_value_style_enum_case_listContext raw_value_style_enum_case_list() {
			return getRuleContext(Raw_value_style_enum_case_listContext.class,0);
		}
		public Raw_value_style_enum_case_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_case_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRaw_value_style_enum_case_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRaw_value_style_enum_case_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRaw_value_style_enum_case_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_case_listContext raw_value_style_enum_case_list() throws RecognitionException {
		Raw_value_style_enum_case_listContext _localctx = new Raw_value_style_enum_case_listContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_raw_value_style_enum_case_list);
		try {
			setState(1424);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1419);
				raw_value_style_enum_case();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1420);
				raw_value_style_enum_case();
				setState(1421);
				match(COMMA);
				setState(1422);
				raw_value_style_enum_case_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_style_enum_caseContext extends ParserRuleContext {
		public Enum_case_nameContext enum_case_name() {
			return getRuleContext(Enum_case_nameContext.class,0);
		}
		public Raw_value_assignmentContext raw_value_assignment() {
			return getRuleContext(Raw_value_assignmentContext.class,0);
		}
		public Raw_value_style_enum_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRaw_value_style_enum_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRaw_value_style_enum_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRaw_value_style_enum_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_caseContext raw_value_style_enum_case() throws RecognitionException {
		Raw_value_style_enum_caseContext _localctx = new Raw_value_style_enum_caseContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_raw_value_style_enum_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1426);
			enum_case_name();
			setState(1428);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1427);
				raw_value_assignment();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_assignmentContext extends ParserRuleContext {
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Raw_value_literalContext raw_value_literal() {
			return getRuleContext(Raw_value_literalContext.class,0);
		}
		public Raw_value_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRaw_value_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRaw_value_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRaw_value_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_assignmentContext raw_value_assignment() throws RecognitionException {
		Raw_value_assignmentContext _localctx = new Raw_value_assignmentContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_raw_value_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1430);
			assignment_operator();
			setState(1431);
			raw_value_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_literalContext extends ParserRuleContext {
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public TerminalNode Static_string_literal() { return getToken(SwiftParser.Static_string_literal, 0); }
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Raw_value_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRaw_value_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRaw_value_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRaw_value_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_literalContext raw_value_literal() throws RecognitionException {
		Raw_value_literalContext _localctx = new Raw_value_literalContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_raw_value_literal);
		try {
			setState(1436);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1433);
				numeric_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1434);
				match(Static_string_literal);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1435);
				boolean_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_declarationContext extends ParserRuleContext {
		public Struct_nameContext struct_name() {
			return getRuleContext(Struct_nameContext.class,0);
		}
		public Struct_bodyContext struct_body() {
			return getRuleContext(Struct_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStruct_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStruct_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitStruct_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1439);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__51 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__74 - 45)) | (1L << (T__76 - 45)) | (1L << (T__79 - 45)) | (1L << (T__96 - 45)) | (1L << (T__97 - 45)) | (1L << (T__98 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==AT || _la==Implicit_parameter_name) {
				{
				setState(1438);
				attributes();
				}
			}

			setState(1442);
			_la = _input.LA(1);
			if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)))) != 0)) {
				{
				setState(1441);
				access_level_modifier();
				}
			}

			setState(1444);
			match(T__39);
			setState(1445);
			struct_name();
			setState(1447);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1446);
				generic_parameter_clause();
				}
			}

			setState(1450);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1449);
				type_inheritance_clause();
				}
			}

			setState(1452);
			struct_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Struct_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStruct_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStruct_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitStruct_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_nameContext struct_name() throws RecognitionException {
		Struct_nameContext _localctx = new Struct_nameContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_struct_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_bodyContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public Struct_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStruct_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStruct_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitStruct_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_bodyContext struct_body() throws RecognitionException {
		Struct_bodyContext _localctx = new Struct_bodyContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1456);
			match(LCURLY);
			setState(1458);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (Regular_identifier - 64)) | (1L << (AT - 64)))) != 0) || _la==Implicit_parameter_name) {
				{
				setState(1457);
				declarations();
				}
			}

			setState(1460);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_declarationContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClass_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClass_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitClass_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__51 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__74 - 45)) | (1L << (T__76 - 45)) | (1L << (T__79 - 45)) | (1L << (T__96 - 45)) | (1L << (T__97 - 45)) | (1L << (T__98 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==AT || _la==Implicit_parameter_name) {
				{
				setState(1462);
				attributes();
				}
			}

			setState(1466);
			_la = _input.LA(1);
			if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)))) != 0)) {
				{
				setState(1465);
				access_level_modifier();
				}
			}

			setState(1468);
			match(T__40);
			setState(1469);
			class_name();
			setState(1471);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1470);
				generic_parameter_clause();
				}
			}

			setState(1474);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1473);
				type_inheritance_clause();
				}
			}

			setState(1476);
			class_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClass_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitClass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_bodyContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			match(LCURLY);
			setState(1482);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (Regular_identifier - 64)) | (1L << (AT - 64)))) != 0) || _la==Implicit_parameter_name) {
				{
				setState(1481);
				declarations();
				}
			}

			setState(1484);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_declarationContext extends ParserRuleContext {
		public Protocol_nameContext protocol_name() {
			return getRuleContext(Protocol_nameContext.class,0);
		}
		public Protocol_bodyContext protocol_body() {
			return getRuleContext(Protocol_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Protocol_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_declarationContext protocol_declaration() throws RecognitionException {
		Protocol_declarationContext _localctx = new Protocol_declarationContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_protocol_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1487);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__51 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__74 - 45)) | (1L << (T__76 - 45)) | (1L << (T__79 - 45)) | (1L << (T__96 - 45)) | (1L << (T__97 - 45)) | (1L << (T__98 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==AT || _la==Implicit_parameter_name) {
				{
				setState(1486);
				attributes();
				}
			}

			setState(1490);
			_la = _input.LA(1);
			if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)))) != 0)) {
				{
				setState(1489);
				access_level_modifier();
				}
			}

			setState(1492);
			match(T__42);
			setState(1493);
			protocol_name();
			setState(1495);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1494);
				type_inheritance_clause();
				}
			}

			setState(1497);
			protocol_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Protocol_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_nameContext protocol_name() throws RecognitionException {
		Protocol_nameContext _localctx = new Protocol_nameContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_protocol_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1499);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_bodyContext extends ParserRuleContext {
		public Protocol_member_declarationsContext protocol_member_declarations() {
			return getRuleContext(Protocol_member_declarationsContext.class,0);
		}
		public Protocol_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_bodyContext protocol_body() throws RecognitionException {
		Protocol_bodyContext _localctx = new Protocol_bodyContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_protocol_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1501);
			match(LCURLY);
			setState(1503);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__40 - 6)) | (1L << (T__43 - 6)) | (1L << (T__44 - 6)) | (1L << (T__45 - 6)) | (1L << (T__46 - 6)) | (1L << (T__47 - 6)) | (1L << (T__51 - 6)) | (1L << (T__52 - 6)) | (1L << (T__53 - 6)) | (1L << (T__56 - 6)) | (1L << (T__57 - 6)) | (1L << (T__58 - 6)) | (1L << (T__59 - 6)) | (1L << (T__60 - 6)) | (1L << (T__61 - 6)) | (1L << (T__62 - 6)) | (1L << (T__63 - 6)) | (1L << (T__64 - 6)) | (1L << (T__65 - 6)) | (1L << (T__66 - 6)) | (1L << (T__67 - 6)) | (1L << (T__68 - 6)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__74 - 70)) | (1L << (T__75 - 70)) | (1L << (T__76 - 70)) | (1L << (T__79 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__82 - 70)) | (1L << (T__96 - 70)) | (1L << (T__97 - 70)) | (1L << (T__98 - 70)) | (1L << (Regular_identifier - 70)) | (1L << (AT - 70)) | (1L << (Implicit_parameter_name - 70)))) != 0)) {
				{
				setState(1502);
				protocol_member_declarations();
				}
			}

			setState(1505);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_member_declarationContext extends ParserRuleContext {
		public Protocol_property_declarationContext protocol_property_declaration() {
			return getRuleContext(Protocol_property_declarationContext.class,0);
		}
		public Protocol_method_declarationContext protocol_method_declaration() {
			return getRuleContext(Protocol_method_declarationContext.class,0);
		}
		public Protocol_initializer_declarationContext protocol_initializer_declaration() {
			return getRuleContext(Protocol_initializer_declarationContext.class,0);
		}
		public Protocol_subscript_declarationContext protocol_subscript_declaration() {
			return getRuleContext(Protocol_subscript_declarationContext.class,0);
		}
		public Protocol_associated_type_declarationContext protocol_associated_type_declaration() {
			return getRuleContext(Protocol_associated_type_declarationContext.class,0);
		}
		public Protocol_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_member_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_member_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_member_declarationContext protocol_member_declaration() throws RecognitionException {
		Protocol_member_declarationContext _localctx = new Protocol_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_protocol_member_declaration);
		try {
			setState(1512);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1507);
				protocol_property_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1508);
				protocol_method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1509);
				protocol_initializer_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1510);
				protocol_subscript_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1511);
				protocol_associated_type_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_member_declarationsContext extends ParserRuleContext {
		public Protocol_member_declarationContext protocol_member_declaration() {
			return getRuleContext(Protocol_member_declarationContext.class,0);
		}
		public Protocol_member_declarationsContext protocol_member_declarations() {
			return getRuleContext(Protocol_member_declarationsContext.class,0);
		}
		public Protocol_member_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_member_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_member_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_member_declarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_member_declarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_member_declarationsContext protocol_member_declarations() throws RecognitionException {
		Protocol_member_declarationsContext _localctx = new Protocol_member_declarationsContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_protocol_member_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1514);
			protocol_member_declaration();
			setState(1516);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__40 - 6)) | (1L << (T__43 - 6)) | (1L << (T__44 - 6)) | (1L << (T__45 - 6)) | (1L << (T__46 - 6)) | (1L << (T__47 - 6)) | (1L << (T__51 - 6)) | (1L << (T__52 - 6)) | (1L << (T__53 - 6)) | (1L << (T__56 - 6)) | (1L << (T__57 - 6)) | (1L << (T__58 - 6)) | (1L << (T__59 - 6)) | (1L << (T__60 - 6)) | (1L << (T__61 - 6)) | (1L << (T__62 - 6)) | (1L << (T__63 - 6)) | (1L << (T__64 - 6)) | (1L << (T__65 - 6)) | (1L << (T__66 - 6)) | (1L << (T__67 - 6)) | (1L << (T__68 - 6)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__74 - 70)) | (1L << (T__75 - 70)) | (1L << (T__76 - 70)) | (1L << (T__79 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__82 - 70)) | (1L << (T__96 - 70)) | (1L << (T__97 - 70)) | (1L << (T__98 - 70)) | (1L << (Regular_identifier - 70)) | (1L << (AT - 70)) | (1L << (Implicit_parameter_name - 70)))) != 0)) {
				{
				setState(1515);
				protocol_member_declarations();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_property_declarationContext extends ParserRuleContext {
		public Variable_declaration_headContext variable_declaration_head() {
			return getRuleContext(Variable_declaration_headContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public Protocol_property_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_property_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_property_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_property_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_property_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_property_declarationContext protocol_property_declaration() throws RecognitionException {
		Protocol_property_declarationContext _localctx = new Protocol_property_declarationContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_protocol_property_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1518);
			variable_declaration_head();
			setState(1519);
			variable_name();
			setState(1520);
			type_annotation();
			setState(1521);
			getter_setter_keyword_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_method_declarationContext extends ParserRuleContext {
		public Function_headContext function_head() {
			return getRuleContext(Function_headContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_signatureContext function_signature() {
			return getRuleContext(Function_signatureContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Protocol_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_method_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_method_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_method_declarationContext protocol_method_declaration() throws RecognitionException {
		Protocol_method_declarationContext _localctx = new Protocol_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_protocol_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1523);
			function_head();
			setState(1524);
			function_name();
			setState(1526);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1525);
				generic_parameter_clause();
				}
			}

			setState(1528);
			function_signature();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_initializer_declarationContext extends ParserRuleContext {
		public Initializer_headContext initializer_head() {
			return getRuleContext(Initializer_headContext.class,0);
		}
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Protocol_initializer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_initializer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_initializer_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_initializer_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_initializer_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_initializer_declarationContext protocol_initializer_declaration() throws RecognitionException {
		Protocol_initializer_declarationContext _localctx = new Protocol_initializer_declarationContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_protocol_initializer_declaration);
		int _la;
		try {
			setState(1545);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1530);
				initializer_head();
				setState(1532);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1531);
					generic_parameter_clause();
					}
				}

				setState(1534);
				parameter_clause();
				setState(1536);
				_la = _input.LA(1);
				if (_la==T__48) {
					{
					setState(1535);
					match(T__48);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1538);
				initializer_head();
				setState(1540);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1539);
					generic_parameter_clause();
					}
				}

				setState(1542);
				parameter_clause();
				setState(1543);
				match(T__49);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_subscript_declarationContext extends ParserRuleContext {
		public Subscript_headContext subscript_head() {
			return getRuleContext(Subscript_headContext.class,0);
		}
		public Subscript_resultContext subscript_result() {
			return getRuleContext(Subscript_resultContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public Protocol_subscript_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_subscript_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_subscript_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_subscript_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_subscript_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_subscript_declarationContext protocol_subscript_declaration() throws RecognitionException {
		Protocol_subscript_declarationContext _localctx = new Protocol_subscript_declarationContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_protocol_subscript_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1547);
			subscript_head();
			setState(1548);
			subscript_result();
			setState(1549);
			getter_setter_keyword_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_associated_type_declarationContext extends ParserRuleContext {
		public Typealias_nameContext typealias_name() {
			return getRuleContext(Typealias_nameContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Typealias_assignmentContext typealias_assignment() {
			return getRuleContext(Typealias_assignmentContext.class,0);
		}
		public Protocol_associated_type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_associated_type_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_associated_type_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_associated_type_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_associated_type_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_associated_type_declarationContext protocol_associated_type_declaration() throws RecognitionException {
		Protocol_associated_type_declarationContext _localctx = new Protocol_associated_type_declarationContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_protocol_associated_type_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1552);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__51 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__74 - 45)) | (1L << (T__76 - 45)) | (1L << (T__79 - 45)) | (1L << (T__96 - 45)) | (1L << (T__97 - 45)) | (1L << (T__98 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==AT || _la==Implicit_parameter_name) {
				{
				setState(1551);
				attributes();
				}
			}

			setState(1555);
			_la = _input.LA(1);
			if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)))) != 0)) {
				{
				setState(1554);
				access_level_modifier();
				}
			}

			setState(1557);
			match(T__52);
			setState(1558);
			typealias_name();
			setState(1560);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1559);
				type_inheritance_clause();
				}
				break;
			}
			setState(1563);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1562);
				typealias_assignment();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_declarationContext extends ParserRuleContext {
		public Initializer_headContext initializer_head() {
			return getRuleContext(Initializer_headContext.class,0);
		}
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public Initializer_bodyContext initializer_body() {
			return getRuleContext(Initializer_bodyContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Initializer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInitializer_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInitializer_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInitializer_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_declarationContext initializer_declaration() throws RecognitionException {
		Initializer_declarationContext _localctx = new Initializer_declarationContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_initializer_declaration);
		int _la;
		try {
			setState(1583);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1565);
				initializer_head();
				setState(1567);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1566);
					generic_parameter_clause();
					}
				}

				setState(1569);
				parameter_clause();
				setState(1571);
				_la = _input.LA(1);
				if (_la==T__48) {
					{
					setState(1570);
					match(T__48);
					}
				}

				setState(1573);
				initializer_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1575);
				initializer_head();
				setState(1577);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1576);
					generic_parameter_clause();
					}
				}

				setState(1579);
				parameter_clause();
				setState(1580);
				match(T__49);
				setState(1581);
				initializer_body();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_headContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Initializer_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInitializer_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInitializer_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInitializer_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_headContext initializer_head() throws RecognitionException {
		Initializer_headContext _localctx = new Initializer_headContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_initializer_head);
		int _la;
		try {
			setState(1608);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1586);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1585);
					attributes();
					}
					break;
				}
				setState(1589);
				_la = _input.LA(1);
				if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__57 - 41)) | (1L << (T__59 - 41)) | (1L << (T__60 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__76 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)) | (1L << (T__82 - 41)))) != 0)) {
					{
					setState(1588);
					declaration_modifiers();
					}
				}

				setState(1591);
				match(T__53);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1593);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1592);
					attributes();
					}
					break;
				}
				setState(1596);
				_la = _input.LA(1);
				if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__57 - 41)) | (1L << (T__59 - 41)) | (1L << (T__60 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__76 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)) | (1L << (T__82 - 41)))) != 0)) {
					{
					setState(1595);
					declaration_modifiers();
					}
				}

				setState(1598);
				match(T__53);
				setState(1599);
				match(QUESTION);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1601);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1600);
					attributes();
					}
					break;
				}
				setState(1604);
				_la = _input.LA(1);
				if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__57 - 41)) | (1L << (T__59 - 41)) | (1L << (T__60 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__76 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)) | (1L << (T__82 - 41)))) != 0)) {
					{
					setState(1603);
					declaration_modifiers();
					}
				}

				setState(1606);
				match(T__53);
				setState(1607);
				match(BANG);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_bodyContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Initializer_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInitializer_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInitializer_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInitializer_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_bodyContext initializer_body() throws RecognitionException {
		Initializer_bodyContext _localctx = new Initializer_bodyContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_initializer_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1610);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Deinitializer_declarationContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Deinitializer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deinitializer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeinitializer_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeinitializer_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDeinitializer_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deinitializer_declarationContext deinitializer_declaration() throws RecognitionException {
		Deinitializer_declarationContext _localctx = new Deinitializer_declarationContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_deinitializer_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1613);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__51 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__74 - 45)) | (1L << (T__76 - 45)) | (1L << (T__79 - 45)) | (1L << (T__96 - 45)) | (1L << (T__97 - 45)) | (1L << (T__98 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==AT || _la==Implicit_parameter_name) {
				{
				setState(1612);
				attributes();
				}
			}

			setState(1615);
			match(T__54);
			setState(1616);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extension_declarationContext extends ParserRuleContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Extension_bodyContext extension_body() {
			return getRuleContext(Extension_bodyContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Extension_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExtension_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExtension_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExtension_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extension_declarationContext extension_declaration() throws RecognitionException {
		Extension_declarationContext _localctx = new Extension_declarationContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_extension_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1619);
			_la = _input.LA(1);
			if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)))) != 0)) {
				{
				setState(1618);
				access_level_modifier();
				}
			}

			setState(1621);
			match(T__55);
			setState(1622);
			type_identifier();
			setState(1624);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1623);
				type_inheritance_clause();
				}
			}

			setState(1626);
			extension_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extension_bodyContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public Extension_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExtension_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExtension_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExtension_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extension_bodyContext extension_body() throws RecognitionException {
		Extension_bodyContext _localctx = new Extension_bodyContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_extension_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
			match(LCURLY);
			setState(1630);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (Regular_identifier - 64)) | (1L << (AT - 64)))) != 0) || _la==Implicit_parameter_name) {
				{
				setState(1629);
				declarations();
				}
			}

			setState(1632);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subscript_declarationContext extends ParserRuleContext {
		public Subscript_headContext subscript_head() {
			return getRuleContext(Subscript_headContext.class,0);
		}
		public Subscript_resultContext subscript_result() {
			return getRuleContext(Subscript_resultContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Getter_setter_blockContext getter_setter_block() {
			return getRuleContext(Getter_setter_blockContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public Subscript_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSubscript_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSubscript_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSubscript_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscript_declarationContext subscript_declaration() throws RecognitionException {
		Subscript_declarationContext _localctx = new Subscript_declarationContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_subscript_declaration);
		try {
			setState(1646);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1634);
				subscript_head();
				setState(1635);
				subscript_result();
				setState(1636);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1638);
				subscript_head();
				setState(1639);
				subscript_result();
				setState(1640);
				getter_setter_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1642);
				subscript_head();
				setState(1643);
				subscript_result();
				setState(1644);
				getter_setter_keyword_block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subscript_headContext extends ParserRuleContext {
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Subscript_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSubscript_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSubscript_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSubscript_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscript_headContext subscript_head() throws RecognitionException {
		Subscript_headContext _localctx = new Subscript_headContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_subscript_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1649);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1648);
				attributes();
				}
				break;
			}
			setState(1652);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__57 - 41)) | (1L << (T__59 - 41)) | (1L << (T__60 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__76 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)) | (1L << (T__82 - 41)))) != 0)) {
				{
				setState(1651);
				declaration_modifiers();
				}
			}

			setState(1654);
			match(T__56);
			setState(1655);
			parameter_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subscript_resultContext extends ParserRuleContext {
		public Arrow_operatorContext arrow_operator() {
			return getRuleContext(Arrow_operatorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Subscript_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSubscript_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSubscript_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSubscript_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscript_resultContext subscript_result() throws RecognitionException {
		Subscript_resultContext _localctx = new Subscript_resultContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_subscript_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657);
			arrow_operator();
			setState(1659);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1658);
				attributes();
				}
				break;
			}
			setState(1661);
			type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator_declarationContext extends ParserRuleContext {
		public Prefix_operator_declarationContext prefix_operator_declaration() {
			return getRuleContext(Prefix_operator_declarationContext.class,0);
		}
		public Postfix_operator_declarationContext postfix_operator_declaration() {
			return getRuleContext(Postfix_operator_declarationContext.class,0);
		}
		public Infix_operator_declarationContext infix_operator_declaration() {
			return getRuleContext(Infix_operator_declarationContext.class,0);
		}
		public Operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOperator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOperator_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitOperator_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_declarationContext operator_declaration() throws RecognitionException {
		Operator_declarationContext _localctx = new Operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_operator_declaration);
		try {
			setState(1666);
			switch (_input.LA(1)) {
			case T__57:
				enterOuterAlt(_localctx, 1);
				{
				setState(1663);
				prefix_operator_declaration();
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 2);
				{
				setState(1664);
				postfix_operator_declaration();
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 3);
				{
				setState(1665);
				infix_operator_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prefix_operator_declarationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Prefix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_operator_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrefix_operator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrefix_operator_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPrefix_operator_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_operator_declarationContext prefix_operator_declaration() throws RecognitionException {
		Prefix_operator_declarationContext _localctx = new Prefix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_prefix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1668);
			match(T__57);
			setState(1669);
			match(T__58);
			setState(1670);
			operator();
			setState(1671);
			match(LCURLY);
			setState(1672);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_operator_declarationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Postfix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_operator_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPostfix_operator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPostfix_operator_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPostfix_operator_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_operator_declarationContext postfix_operator_declaration() throws RecognitionException {
		Postfix_operator_declarationContext _localctx = new Postfix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_postfix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1674);
			match(T__59);
			setState(1675);
			match(T__58);
			setState(1676);
			operator();
			setState(1677);
			match(LCURLY);
			setState(1678);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Infix_operator_declarationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Infix_operator_attributesContext infix_operator_attributes() {
			return getRuleContext(Infix_operator_attributesContext.class,0);
		}
		public Infix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_operator_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInfix_operator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInfix_operator_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInfix_operator_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Infix_operator_declarationContext infix_operator_declaration() throws RecognitionException {
		Infix_operator_declarationContext _localctx = new Infix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_infix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1680);
			match(T__60);
			setState(1681);
			match(T__58);
			setState(1682);
			operator();
			setState(1683);
			match(LCURLY);
			setState(1684);
			infix_operator_attributes();
			setState(1685);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Infix_operator_attributesContext extends ParserRuleContext {
		public Precedence_clauseContext precedence_clause() {
			return getRuleContext(Precedence_clauseContext.class,0);
		}
		public Associativity_clauseContext associativity_clause() {
			return getRuleContext(Associativity_clauseContext.class,0);
		}
		public Infix_operator_attributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_operator_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInfix_operator_attributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInfix_operator_attributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInfix_operator_attributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Infix_operator_attributesContext infix_operator_attributes() throws RecognitionException {
		Infix_operator_attributesContext _localctx = new Infix_operator_attributesContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_infix_operator_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1688);
			_la = _input.LA(1);
			if (_la==T__61) {
				{
				setState(1687);
				precedence_clause();
				}
			}

			setState(1691);
			_la = _input.LA(1);
			if (_la==T__62) {
				{
				setState(1690);
				associativity_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Precedence_clauseContext extends ParserRuleContext {
		public Precedence_levelContext precedence_level() {
			return getRuleContext(Precedence_levelContext.class,0);
		}
		public Precedence_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrecedence_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrecedence_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPrecedence_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence_clauseContext precedence_clause() throws RecognitionException {
		Precedence_clauseContext _localctx = new Precedence_clauseContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_precedence_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1693);
			match(T__61);
			setState(1694);
			precedence_level();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Precedence_levelContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Precedence_levelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_level; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrecedence_level(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrecedence_level(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPrecedence_level(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence_levelContext precedence_level() throws RecognitionException {
		Precedence_levelContext _localctx = new Precedence_levelContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_precedence_level);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1696);
			integer_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Associativity_clauseContext extends ParserRuleContext {
		public AssociativityContext associativity() {
			return getRuleContext(AssociativityContext.class,0);
		}
		public Associativity_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativity_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAssociativity_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAssociativity_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAssociativity_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Associativity_clauseContext associativity_clause() throws RecognitionException {
		Associativity_clauseContext _localctx = new Associativity_clauseContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_associativity_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1698);
			match(T__62);
			setState(1699);
			associativity();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssociativityContext extends ParserRuleContext {
		public AssociativityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAssociativity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAssociativity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAssociativity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssociativityContext associativity() throws RecognitionException {
		AssociativityContext _localctx = new AssociativityContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_associativity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_modifierContext extends ParserRuleContext {
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Declaration_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeclaration_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeclaration_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDeclaration_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_modifierContext declaration_modifier() throws RecognitionException {
		Declaration_modifierContext _localctx = new Declaration_modifierContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_declaration_modifier);
		try {
			setState(1728);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1703);
				match(T__40);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1704);
				match(T__66);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1705);
				match(T__67);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1706);
				match(T__68);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1707);
				match(T__60);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1708);
				match(T__69);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1709);
				match(T__70);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1710);
				match(T__71);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1711);
				match(T__72);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1712);
				match(T__73);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1713);
				match(T__59);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1714);
				match(T__57);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1715);
				match(T__74);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1716);
				match(T__75);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1717);
				match(T__76);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1718);
				match(T__76);
				setState(1719);
				match(LPAREN);
				setState(1720);
				match(T__77);
				setState(1721);
				match(RPAREN);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1722);
				match(T__76);
				setState(1723);
				match(LPAREN);
				setState(1724);
				match(T__78);
				setState(1725);
				match(RPAREN);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1726);
				match(T__79);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1727);
				access_level_modifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_modifiersContext extends ParserRuleContext {
		public Declaration_modifierContext declaration_modifier() {
			return getRuleContext(Declaration_modifierContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Declaration_modifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeclaration_modifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeclaration_modifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDeclaration_modifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_modifiersContext declaration_modifiers() throws RecognitionException {
		Declaration_modifiersContext _localctx = new Declaration_modifiersContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_declaration_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
			declaration_modifier();
			setState(1732);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__57 - 41)) | (1L << (T__59 - 41)) | (1L << (T__60 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__76 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)) | (1L << (T__82 - 41)))) != 0)) {
				{
				setState(1731);
				declaration_modifiers();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Access_level_modifierContext extends ParserRuleContext {
		public Access_level_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_level_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAccess_level_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAccess_level_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAccess_level_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_level_modifierContext access_level_modifier() throws RecognitionException {
		Access_level_modifierContext _localctx = new Access_level_modifierContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_access_level_modifier);
		try {
			setState(1749);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1734);
				match(T__80);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1735);
				match(T__80);
				setState(1736);
				match(LPAREN);
				setState(1737);
				match(T__45);
				setState(1738);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1739);
				match(T__81);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1740);
				match(T__81);
				setState(1741);
				match(LPAREN);
				setState(1742);
				match(T__45);
				setState(1743);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1744);
				match(T__82);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1745);
				match(T__82);
				setState(1746);
				match(LPAREN);
				setState(1747);
				match(T__45);
				setState(1748);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternContext extends ParserRuleContext {
		public Wildcard_patternContext wildcard_pattern() {
			return getRuleContext(Wildcard_patternContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Identifier_patternContext identifier_pattern() {
			return getRuleContext(Identifier_patternContext.class,0);
		}
		public Value_binding_patternContext value_binding_pattern() {
			return getRuleContext(Value_binding_patternContext.class,0);
		}
		public Tuple_patternContext tuple_pattern() {
			return getRuleContext(Tuple_patternContext.class,0);
		}
		public Enum_case_patternContext enum_case_pattern() {
			return getRuleContext(Enum_case_patternContext.class,0);
		}
		public Optional_patternContext optional_pattern() {
			return getRuleContext(Optional_patternContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Expression_patternContext expression_pattern() {
			return getRuleContext(Expression_patternContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		return pattern(0);
	}

	private PatternContext pattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PatternContext _localctx = new PatternContext(_ctx, _parentState);
		PatternContext _prevctx = _localctx;
		int _startState = 328;
		enterRecursionRule(_localctx, 328, RULE_pattern, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1770);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1752);
				wildcard_pattern();
				setState(1754);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1753);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1756);
				identifier_pattern();
				setState(1758);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1757);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1760);
				value_binding_pattern();
				}
				break;
			case 4:
				{
				setState(1761);
				tuple_pattern();
				setState(1763);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1762);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(1765);
				enum_case_pattern();
				}
				break;
			case 6:
				{
				setState(1766);
				optional_pattern();
				}
				break;
			case 7:
				{
				setState(1767);
				match(T__83);
				setState(1768);
				type(0);
				}
				break;
			case 8:
				{
				setState(1769);
				expression_pattern();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1777);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PatternContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_pattern);
					setState(1772);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1773);
					match(T__84);
					setState(1774);
					type(0);
					}
					} 
				}
				setState(1779);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Wildcard_patternContext extends ParserRuleContext {
		public Wildcard_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWildcard_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWildcard_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitWildcard_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wildcard_patternContext wildcard_pattern() throws RecognitionException {
		Wildcard_patternContext _localctx = new Wildcard_patternContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_wildcard_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1780);
			match(UNDERSCORE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_patternContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Identifier_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIdentifier_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIdentifier_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitIdentifier_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_patternContext identifier_pattern() throws RecognitionException {
		Identifier_patternContext _localctx = new Identifier_patternContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_identifier_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1782);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_binding_patternContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Value_binding_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_binding_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterValue_binding_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitValue_binding_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitValue_binding_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_binding_patternContext value_binding_pattern() throws RecognitionException {
		Value_binding_patternContext _localctx = new Value_binding_patternContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_value_binding_pattern);
		try {
			setState(1788);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(1784);
				match(T__5);
				setState(1785);
				pattern(0);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(1786);
				match(T__4);
				setState(1787);
				pattern(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_patternContext extends ParserRuleContext {
		public Tuple_pattern_element_listContext tuple_pattern_element_list() {
			return getRuleContext(Tuple_pattern_element_listContext.class,0);
		}
		public Tuple_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTuple_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTuple_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTuple_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_patternContext tuple_pattern() throws RecognitionException {
		Tuple_patternContext _localctx = new Tuple_patternContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_tuple_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1790);
			match(LPAREN);
			setState(1792);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1791);
				tuple_pattern_element_list();
				}
				break;
			}
			setState(1794);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_pattern_element_listContext extends ParserRuleContext {
		public List<Tuple_pattern_elementContext> tuple_pattern_element() {
			return getRuleContexts(Tuple_pattern_elementContext.class);
		}
		public Tuple_pattern_elementContext tuple_pattern_element(int i) {
			return getRuleContext(Tuple_pattern_elementContext.class,i);
		}
		public Tuple_pattern_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern_element_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTuple_pattern_element_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTuple_pattern_element_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTuple_pattern_element_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_pattern_element_listContext tuple_pattern_element_list() throws RecognitionException {
		Tuple_pattern_element_listContext _localctx = new Tuple_pattern_element_listContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_tuple_pattern_element_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1796);
			tuple_pattern_element();
			setState(1801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1797);
				match(COMMA);
				setState(1798);
				tuple_pattern_element();
				}
				}
				setState(1803);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_pattern_elementContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Tuple_pattern_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTuple_pattern_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTuple_pattern_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTuple_pattern_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_pattern_elementContext tuple_pattern_element() throws RecognitionException {
		Tuple_pattern_elementContext _localctx = new Tuple_pattern_elementContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_tuple_pattern_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1804);
			pattern(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_case_patternContext extends ParserRuleContext {
		public Enum_case_nameContext enum_case_name() {
			return getRuleContext(Enum_case_nameContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Tuple_patternContext tuple_pattern() {
			return getRuleContext(Tuple_patternContext.class,0);
		}
		public Enum_case_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_case_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterEnum_case_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitEnum_case_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitEnum_case_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_case_patternContext enum_case_pattern() throws RecognitionException {
		Enum_case_patternContext _localctx = new Enum_case_patternContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_enum_case_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1807);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__51 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__74 - 45)) | (1L << (T__76 - 45)) | (1L << (T__79 - 45)) | (1L << (T__96 - 45)) | (1L << (T__97 - 45)) | (1L << (T__98 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==Implicit_parameter_name) {
				{
				setState(1806);
				type_identifier();
				}
			}

			setState(1809);
			match(DOT);
			setState(1810);
			enum_case_name();
			setState(1812);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1811);
				tuple_pattern();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optional_patternContext extends ParserRuleContext {
		public Identifier_patternContext identifier_pattern() {
			return getRuleContext(Identifier_patternContext.class,0);
		}
		public Optional_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOptional_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOptional_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitOptional_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_patternContext optional_pattern() throws RecognitionException {
		Optional_patternContext _localctx = new Optional_patternContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_optional_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1814);
			identifier_pattern();
			setState(1815);
			match(QUESTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_patternContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExpression_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExpression_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExpression_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_patternContext expression_pattern() throws RecognitionException {
		Expression_patternContext _localctx = new Expression_patternContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_expression_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1817);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public Attribute_nameContext attribute_name() {
			return getRuleContext(Attribute_nameContext.class,0);
		}
		public Attribute_argument_clauseContext attribute_argument_clause() {
			return getRuleContext(Attribute_argument_clauseContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1819);
				match(AT);
				}
			}

			setState(1822);
			attribute_name();
			setState(1824);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1823);
				attribute_argument_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Attribute_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAttribute_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAttribute_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAttribute_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_nameContext attribute_name() throws RecognitionException {
		Attribute_nameContext _localctx = new Attribute_nameContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_attribute_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1826);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_argument_clauseContext extends ParserRuleContext {
		public Balanced_tokensContext balanced_tokens() {
			return getRuleContext(Balanced_tokensContext.class,0);
		}
		public Attribute_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_argument_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAttribute_argument_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAttribute_argument_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAttribute_argument_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_argument_clauseContext attribute_argument_clause() throws RecognitionException {
		Attribute_argument_clauseContext _localctx = new Attribute_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_attribute_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
			match(LPAREN);
			setState(1830);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1829);
				balanced_tokens();
				}
				break;
			}
			setState(1832);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributesContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_attributes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1835); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1834);
					attribute();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1837); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Balanced_tokensContext extends ParserRuleContext {
		public List<Balanced_tokenContext> balanced_token() {
			return getRuleContexts(Balanced_tokenContext.class);
		}
		public Balanced_tokenContext balanced_token(int i) {
			return getRuleContext(Balanced_tokenContext.class,i);
		}
		public Balanced_tokensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balanced_tokens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBalanced_tokens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBalanced_tokens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBalanced_tokens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Balanced_tokensContext balanced_tokens() throws RecognitionException {
		Balanced_tokensContext _localctx = new Balanced_tokensContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_balanced_tokens);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1840); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1839);
					balanced_token();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1842); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Balanced_tokenContext extends ParserRuleContext {
		public Balanced_tokensContext balanced_tokens() {
			return getRuleContext(Balanced_tokensContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Context_sensitive_keywordContext context_sensitive_keyword() {
			return getRuleContext(Context_sensitive_keywordContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Balanced_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balanced_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBalanced_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBalanced_token(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBalanced_token(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Balanced_tokenContext balanced_token() throws RecognitionException {
		Balanced_tokenContext _localctx = new Balanced_tokenContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_balanced_token);
		try {
			setState(1864);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1844);
				match(LPAREN);
				setState(1846);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1845);
					balanced_tokens();
					}
					break;
				}
				setState(1848);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1849);
				match(LBRACK);
				setState(1851);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1850);
					balanced_tokens();
					}
					break;
				}
				setState(1853);
				match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1854);
				match(LCURLY);
				setState(1856);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1855);
					balanced_tokens();
					}
					break;
				}
				setState(1858);
				match(RCURLY);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1859);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1860);
				expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1861);
				context_sensitive_keyword();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1862);
				literal();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1863);
				operator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Prefix_expressionContext prefix_expression() {
			return getRuleContext(Prefix_expressionContext.class,0);
		}
		public Try_operatorContext try_operator() {
			return getRuleContext(Try_operatorContext.class,0);
		}
		public Binary_expressionsContext binary_expressions() {
			return getRuleContext(Binary_expressionsContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1867);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(1866);
				try_operator();
				}
				break;
			}
			setState(1869);
			prefix_expression();
			setState(1871);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				{
				setState(1870);
				binary_expressions();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExpression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1873);
			expression();
			setState(1878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1874);
				match(COMMA);
				setState(1875);
				expression();
				}
				}
				setState(1880);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prefix_expressionContext extends ParserRuleContext {
		public Prefix_operatorContext prefix_operator() {
			return getRuleContext(Prefix_operatorContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public In_out_expressionContext in_out_expression() {
			return getRuleContext(In_out_expressionContext.class,0);
		}
		public Prefix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrefix_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrefix_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPrefix_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_expressionContext prefix_expression() throws RecognitionException {
		Prefix_expressionContext _localctx = new Prefix_expressionContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_prefix_expression);
		try {
			setState(1886);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1881);
				prefix_operator();
				setState(1882);
				postfix_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1884);
				postfix_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1885);
				in_out_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class In_out_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public In_out_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_out_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIn_out_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIn_out_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitIn_out_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_out_expressionContext in_out_expression() throws RecognitionException {
		In_out_expressionContext _localctx = new In_out_expressionContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_in_out_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1888);
			match(AND);
			setState(1889);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Try_operatorContext extends ParserRuleContext {
		public Try_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTry_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTry_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTry_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_operatorContext try_operator() throws RecognitionException {
		Try_operatorContext _localctx = new Try_operatorContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_try_operator);
		try {
			setState(1896);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1891);
				match(T__85);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1892);
				match(T__85);
				setState(1893);
				match(QUESTION);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1894);
				match(T__85);
				setState(1895);
				match(BANG);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_expressionContext extends ParserRuleContext {
		public Binary_operatorContext binary_operator() {
			return getRuleContext(Binary_operatorContext.class,0);
		}
		public Prefix_expressionContext prefix_expression() {
			return getRuleContext(Prefix_expressionContext.class,0);
		}
		public Conditional_operatorContext conditional_operator() {
			return getRuleContext(Conditional_operatorContext.class,0);
		}
		public Try_operatorContext try_operator() {
			return getRuleContext(Try_operatorContext.class,0);
		}
		public Type_casting_operatorContext type_casting_operator() {
			return getRuleContext(Type_casting_operatorContext.class,0);
		}
		public Binary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBinary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBinary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBinary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_expressionContext binary_expression() throws RecognitionException {
		Binary_expressionContext _localctx = new Binary_expressionContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_binary_expression);
		try {
			setState(1908);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1898);
				binary_operator();
				setState(1899);
				prefix_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1901);
				conditional_operator();
				setState(1903);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1902);
					try_operator();
					}
					break;
				}
				setState(1905);
				prefix_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1907);
				type_casting_operator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_expressionsContext extends ParserRuleContext {
		public List<Binary_expressionContext> binary_expression() {
			return getRuleContexts(Binary_expressionContext.class);
		}
		public Binary_expressionContext binary_expression(int i) {
			return getRuleContext(Binary_expressionContext.class,i);
		}
		public Binary_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBinary_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBinary_expressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBinary_expressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_expressionsContext binary_expressions() throws RecognitionException {
		Binary_expressionsContext _localctx = new Binary_expressionsContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_binary_expressions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1911); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1910);
					binary_expression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1913); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_operatorContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Try_operatorContext try_operator() {
			return getRuleContext(Try_operatorContext.class,0);
		}
		public Conditional_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterConditional_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitConditional_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitConditional_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_operatorContext conditional_operator() throws RecognitionException {
		Conditional_operatorContext _localctx = new Conditional_operatorContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_conditional_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1915);
			match(QUESTION);
			setState(1917);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(1916);
				try_operator();
				}
				break;
			}
			setState(1919);
			expression();
			setState(1920);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_casting_operatorContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type_casting_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_casting_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterType_casting_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitType_casting_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitType_casting_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_casting_operatorContext type_casting_operator() throws RecognitionException {
		Type_casting_operatorContext _localctx = new Type_casting_operatorContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_type_casting_operator);
		try {
			setState(1932);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1922);
				match(T__83);
				setState(1923);
				type(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1924);
				match(T__84);
				setState(1925);
				type(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1926);
				match(T__84);
				setState(1927);
				match(QUESTION);
				setState(1928);
				type(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1929);
				match(T__84);
				setState(1930);
				match(BANG);
				setState(1931);
				type(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Generic_argument_clauseContext generic_argument_clause() {
			return getRuleContext(Generic_argument_clauseContext.class,0);
		}
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public Self_expressionContext self_expression() {
			return getRuleContext(Self_expressionContext.class,0);
		}
		public Superclass_expressionContext superclass_expression() {
			return getRuleContext(Superclass_expressionContext.class,0);
		}
		public Closure_expressionContext closure_expression() {
			return getRuleContext(Closure_expressionContext.class,0);
		}
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public Wildcard_expressionContext wildcard_expression() {
			return getRuleContext(Wildcard_expressionContext.class,0);
		}
		public Selector_expressionContext selector_expression() {
			return getRuleContext(Selector_expressionContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_primary_expression);
		try {
			setState(1945);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1934);
				identifier();
				setState(1936);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1935);
					generic_argument_clause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1938);
				literal_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1939);
				self_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1940);
				superclass_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1941);
				closure_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1942);
				parenthesized_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1943);
				wildcard_expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1944);
				selector_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Implicit_member_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Implicit_member_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicit_member_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImplicit_member_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImplicit_member_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitImplicit_member_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Implicit_member_expressionContext implicit_member_expression() throws RecognitionException {
		Implicit_member_expressionContext _localctx = new Implicit_member_expressionContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_implicit_member_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1947);
			match(DOT);
			setState(1948);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_expressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Array_literalContext array_literal() {
			return getRuleContext(Array_literalContext.class,0);
		}
		public Dictionary_literalContext dictionary_literal() {
			return getRuleContext(Dictionary_literalContext.class,0);
		}
		public Literal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLiteral_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLiteral_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitLiteral_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_expressionContext literal_expression() throws RecognitionException {
		Literal_expressionContext _localctx = new Literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_literal_expression);
		try {
			setState(1957);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1950);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1951);
				array_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1952);
				dictionary_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1953);
				match(T__86);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1954);
				match(T__87);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1955);
				match(T__88);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1956);
				match(T__89);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_literalContext extends ParserRuleContext {
		public Array_literal_itemsContext array_literal_items() {
			return getRuleContext(Array_literal_itemsContext.class,0);
		}
		public Array_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArray_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArray_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitArray_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_literalContext array_literal() throws RecognitionException {
		Array_literalContext _localctx = new Array_literalContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_array_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1959);
			match(LBRACK);
			setState(1961);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				setState(1960);
				array_literal_items();
				}
				break;
			}
			setState(1963);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_literal_itemsContext extends ParserRuleContext {
		public List<Array_literal_itemContext> array_literal_item() {
			return getRuleContexts(Array_literal_itemContext.class);
		}
		public Array_literal_itemContext array_literal_item(int i) {
			return getRuleContext(Array_literal_itemContext.class,i);
		}
		public Array_literal_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArray_literal_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArray_literal_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitArray_literal_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_literal_itemsContext array_literal_items() throws RecognitionException {
		Array_literal_itemsContext _localctx = new Array_literal_itemsContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_array_literal_items);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1965);
			array_literal_item();
			setState(1970);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1966);
					match(COMMA);
					setState(1967);
					array_literal_item();
					}
					} 
				}
				setState(1972);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			}
			setState(1974);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1973);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_literal_itemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_literal_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArray_literal_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArray_literal_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitArray_literal_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_literal_itemContext array_literal_item() throws RecognitionException {
		Array_literal_itemContext _localctx = new Array_literal_itemContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_array_literal_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1976);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dictionary_literalContext extends ParserRuleContext {
		public Dictionary_literal_itemsContext dictionary_literal_items() {
			return getRuleContext(Dictionary_literal_itemsContext.class,0);
		}
		public Empty_dictionary_literalContext empty_dictionary_literal() {
			return getRuleContext(Empty_dictionary_literalContext.class,0);
		}
		public Dictionary_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDictionary_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDictionary_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDictionary_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dictionary_literalContext dictionary_literal() throws RecognitionException {
		Dictionary_literalContext _localctx = new Dictionary_literalContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_dictionary_literal);
		try {
			setState(1983);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1978);
				match(LBRACK);
				setState(1979);
				dictionary_literal_items();
				setState(1980);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1982);
				empty_dictionary_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dictionary_literal_itemsContext extends ParserRuleContext {
		public List<Dictionary_literal_itemContext> dictionary_literal_item() {
			return getRuleContexts(Dictionary_literal_itemContext.class);
		}
		public Dictionary_literal_itemContext dictionary_literal_item(int i) {
			return getRuleContext(Dictionary_literal_itemContext.class,i);
		}
		public Dictionary_literal_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_literal_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDictionary_literal_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDictionary_literal_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDictionary_literal_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dictionary_literal_itemsContext dictionary_literal_items() throws RecognitionException {
		Dictionary_literal_itemsContext _localctx = new Dictionary_literal_itemsContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_dictionary_literal_items);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1985);
			dictionary_literal_item();
			setState(1990);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1986);
					match(COMMA);
					setState(1987);
					dictionary_literal_item();
					}
					} 
				}
				setState(1992);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			}
			setState(1994);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1993);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dictionary_literal_itemContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Dictionary_literal_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_literal_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDictionary_literal_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDictionary_literal_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDictionary_literal_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dictionary_literal_itemContext dictionary_literal_item() throws RecognitionException {
		Dictionary_literal_itemContext _localctx = new Dictionary_literal_itemContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_dictionary_literal_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1996);
			expression();
			setState(1997);
			match(COLON);
			setState(1998);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Empty_dictionary_literalContext extends ParserRuleContext {
		public Empty_dictionary_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_dictionary_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterEmpty_dictionary_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitEmpty_dictionary_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitEmpty_dictionary_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Empty_dictionary_literalContext empty_dictionary_literal() throws RecognitionException {
		Empty_dictionary_literalContext _localctx = new Empty_dictionary_literalContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_empty_dictionary_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2000);
			match(LBRACK);
			setState(2001);
			match(COLON);
			setState(2002);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Self_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Self_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSelf_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSelf_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSelf_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Self_expressionContext self_expression() throws RecognitionException {
		Self_expressionContext _localctx = new Self_expressionContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_self_expression);
		try {
			setState(2016);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2004);
				match(T__90);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2005);
				match(T__90);
				setState(2006);
				match(DOT);
				setState(2007);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2008);
				match(T__90);
				setState(2009);
				match(LBRACK);
				setState(2010);
				expression_list();
				setState(2011);
				match(RBRACK);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2013);
				match(T__90);
				setState(2014);
				match(DOT);
				setState(2015);
				match(T__53);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Superclass_expressionContext extends ParserRuleContext {
		public Superclass_method_expressionContext superclass_method_expression() {
			return getRuleContext(Superclass_method_expressionContext.class,0);
		}
		public Superclass_subscript_expressionContext superclass_subscript_expression() {
			return getRuleContext(Superclass_subscript_expressionContext.class,0);
		}
		public Superclass_initializer_expressionContext superclass_initializer_expression() {
			return getRuleContext(Superclass_initializer_expressionContext.class,0);
		}
		public Superclass_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSuperclass_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSuperclass_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSuperclass_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Superclass_expressionContext superclass_expression() throws RecognitionException {
		Superclass_expressionContext _localctx = new Superclass_expressionContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_superclass_expression);
		try {
			setState(2021);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2018);
				superclass_method_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2019);
				superclass_subscript_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2020);
				superclass_initializer_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Superclass_method_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Superclass_method_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_method_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSuperclass_method_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSuperclass_method_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSuperclass_method_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Superclass_method_expressionContext superclass_method_expression() throws RecognitionException {
		Superclass_method_expressionContext _localctx = new Superclass_method_expressionContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_superclass_method_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2023);
			match(T__91);
			setState(2024);
			match(DOT);
			setState(2025);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Superclass_subscript_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Superclass_subscript_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_subscript_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSuperclass_subscript_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSuperclass_subscript_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSuperclass_subscript_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Superclass_subscript_expressionContext superclass_subscript_expression() throws RecognitionException {
		Superclass_subscript_expressionContext _localctx = new Superclass_subscript_expressionContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_superclass_subscript_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2027);
			match(T__91);
			setState(2028);
			match(LBRACK);
			setState(2029);
			expression();
			setState(2030);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Superclass_initializer_expressionContext extends ParserRuleContext {
		public Superclass_initializer_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_initializer_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSuperclass_initializer_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSuperclass_initializer_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSuperclass_initializer_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Superclass_initializer_expressionContext superclass_initializer_expression() throws RecognitionException {
		Superclass_initializer_expressionContext _localctx = new Superclass_initializer_expressionContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_superclass_initializer_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2032);
			match(T__91);
			setState(2033);
			match(DOT);
			setState(2034);
			match(T__53);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Closure_expressionContext extends ParserRuleContext {
		public Explicit_closure_expressionContext explicit_closure_expression() {
			return getRuleContext(Explicit_closure_expressionContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Closure_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClosure_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClosure_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitClosure_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Closure_expressionContext closure_expression() throws RecognitionException {
		Closure_expressionContext _localctx = new Closure_expressionContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_closure_expression);
		try {
			setState(2038);
			switch (_input.LA(1)) {
			case LCURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(2036);
				explicit_closure_expression();
				}
				break;
			case DOT:
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
			case Operator_head_other:
				enterOuterAlt(_localctx, 2);
				{
				setState(2037);
				operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Explicit_closure_expressionContext extends ParserRuleContext {
		public Closure_signatureContext closure_signature() {
			return getRuleContext(Closure_signatureContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Explicit_closure_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_closure_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExplicit_closure_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExplicit_closure_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExplicit_closure_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Explicit_closure_expressionContext explicit_closure_expression() throws RecognitionException {
		Explicit_closure_expressionContext _localctx = new Explicit_closure_expressionContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_explicit_closure_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2040);
			match(LCURLY);
			setState(2042);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				setState(2041);
				closure_signature();
				}
				break;
			}
			setState(2045);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(2044);
				statements();
				}
				break;
			}
			setState(2047);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Closure_signatureContext extends ParserRuleContext {
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public Function_resultContext function_result() {
			return getRuleContext(Function_resultContext.class,0);
		}
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Capture_listContext capture_list() {
			return getRuleContext(Capture_listContext.class,0);
		}
		public Closure_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClosure_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClosure_signature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitClosure_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Closure_signatureContext closure_signature() throws RecognitionException {
		Closure_signatureContext _localctx = new Closure_signatureContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_closure_signature);
		try {
			setState(2078);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2049);
				parameter_clause();
				setState(2051);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(2050);
					function_result();
					}
					break;
				}
				setState(2053);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2055);
				identifier_list();
				setState(2057);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(2056);
					function_result();
					}
					break;
				}
				setState(2059);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2061);
				capture_list();
				setState(2062);
				parameter_clause();
				setState(2064);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(2063);
					function_result();
					}
					break;
				}
				setState(2066);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2068);
				capture_list();
				setState(2069);
				identifier_list();
				setState(2071);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(2070);
					function_result();
					}
					break;
				}
				setState(2073);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2075);
				capture_list();
				setState(2076);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Capture_listContext extends ParserRuleContext {
		public Capture_list_itemsContext capture_list_items() {
			return getRuleContext(Capture_list_itemsContext.class,0);
		}
		public Capture_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCapture_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCapture_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCapture_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capture_listContext capture_list() throws RecognitionException {
		Capture_listContext _localctx = new Capture_listContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_capture_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2080);
			match(LBRACK);
			setState(2081);
			capture_list_items();
			setState(2082);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Capture_list_itemsContext extends ParserRuleContext {
		public List<Capture_list_itemContext> capture_list_item() {
			return getRuleContexts(Capture_list_itemContext.class);
		}
		public Capture_list_itemContext capture_list_item(int i) {
			return getRuleContext(Capture_list_itemContext.class,i);
		}
		public Capture_list_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_list_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCapture_list_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCapture_list_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCapture_list_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capture_list_itemsContext capture_list_items() throws RecognitionException {
		Capture_list_itemsContext _localctx = new Capture_list_itemsContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_capture_list_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2084);
			capture_list_item();
			setState(2089);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2085);
				match(COMMA);
				setState(2086);
				capture_list_item();
				}
				}
				setState(2091);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Capture_list_itemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Capture_specifierContext capture_specifier() {
			return getRuleContext(Capture_specifierContext.class,0);
		}
		public Capture_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_list_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCapture_list_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCapture_list_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCapture_list_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capture_list_itemContext capture_list_item() throws RecognitionException {
		Capture_list_itemContext _localctx = new Capture_list_itemContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_capture_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2093);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(2092);
				capture_specifier();
				}
				break;
			}
			setState(2095);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Capture_specifierContext extends ParserRuleContext {
		public Capture_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCapture_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCapture_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCapture_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capture_specifierContext capture_specifier() throws RecognitionException {
		Capture_specifierContext _localctx = new Capture_specifierContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_capture_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2097);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (T__76 - 77)) | (1L << (T__79 - 77)) | (1L << (T__92 - 77)) | (1L << (T__93 - 77)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parenthesized_expressionContext extends ParserRuleContext {
		public Expression_element_listContext expression_element_list() {
			return getRuleContext(Expression_element_listContext.class,0);
		}
		public Parenthesized_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesized_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterParenthesized_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitParenthesized_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitParenthesized_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parenthesized_expressionContext parenthesized_expression() throws RecognitionException {
		Parenthesized_expressionContext _localctx = new Parenthesized_expressionContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_parenthesized_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2099);
			match(LPAREN);
			setState(2101);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				{
				setState(2100);
				expression_element_list();
				}
				break;
			}
			setState(2103);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_element_listContext extends ParserRuleContext {
		public List<Expression_elementContext> expression_element() {
			return getRuleContexts(Expression_elementContext.class);
		}
		public Expression_elementContext expression_element(int i) {
			return getRuleContext(Expression_elementContext.class,i);
		}
		public Expression_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_element_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExpression_element_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExpression_element_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExpression_element_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_element_listContext expression_element_list() throws RecognitionException {
		Expression_element_listContext _localctx = new Expression_element_listContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_expression_element_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2105);
			expression_element();
			setState(2110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2106);
				match(COMMA);
				setState(2107);
				expression_element();
				}
				}
				setState(2112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_elementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Expression_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExpression_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExpression_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExpression_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_elementContext expression_element() throws RecognitionException {
		Expression_elementContext _localctx = new Expression_elementContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_expression_element);
		try {
			setState(2118);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2113);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2114);
				identifier();
				setState(2115);
				match(COLON);
				setState(2116);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Wildcard_expressionContext extends ParserRuleContext {
		public Wildcard_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWildcard_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWildcard_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitWildcard_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wildcard_expressionContext wildcard_expression() throws RecognitionException {
		Wildcard_expressionContext _localctx = new Wildcard_expressionContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_wildcard_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2120);
			match(UNDERSCORE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selector_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Selector_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSelector_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSelector_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSelector_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selector_expressionContext selector_expression() throws RecognitionException {
		Selector_expressionContext _localctx = new Selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_selector_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2122);
			match(T__94);
			setState(2123);
			match(LPAREN);
			setState(2124);
			expression();
			setState(2125);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_expressionContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Chain_postfix_expressionContext chain_postfix_expression() {
			return getRuleContext(Chain_postfix_expressionContext.class,0);
		}
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPostfix_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPostfix_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPostfix_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		return postfix_expression(0);
	}

	private Postfix_expressionContext postfix_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, _parentState);
		Postfix_expressionContext _prevctx = _localctx;
		int _startState = 432;
		enterRecursionRule(_localctx, 432, RULE_postfix_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2128);
			primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Postfix_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
					setState(2130);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2131);
					chain_postfix_expression();
					}
					} 
				}
				setState(2136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Chain_postfix_expressionContext extends ParserRuleContext {
		public Chain_postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chain_postfix_expression; }
	 
		public Chain_postfix_expressionContext() { }
		public void copyFrom(Chain_postfix_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Function_call_with_closure_expressionContext extends Chain_postfix_expressionContext {
		public Trailing_closureContext trailing_closure() {
			return getRuleContext(Trailing_closureContext.class,0);
		}
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public Function_call_with_closure_expressionContext(Chain_postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunction_call_with_closure_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunction_call_with_closure_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFunction_call_with_closure_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Initializer_expression_with_argsContext extends Chain_postfix_expressionContext {
		public Argument_namesContext argument_names() {
			return getRuleContext(Argument_namesContext.class,0);
		}
		public Initializer_expression_with_argsContext(Chain_postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInitializer_expression_with_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInitializer_expression_with_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInitializer_expression_with_args(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Explicit_member_expressionContext extends Chain_postfix_expressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Generic_argument_clauseContext generic_argument_clause() {
			return getRuleContext(Generic_argument_clauseContext.class,0);
		}
		public Explicit_member_expressionContext(Chain_postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExplicit_member_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExplicit_member_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExplicit_member_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Chain_postfix_operatorContext extends Chain_postfix_expressionContext {
		public Postfix_operatorContext postfix_operator() {
			return getRuleContext(Postfix_operatorContext.class,0);
		}
		public Chain_postfix_operatorContext(Chain_postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterChain_postfix_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitChain_postfix_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitChain_postfix_operator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Function_call_expressionContext extends Chain_postfix_expressionContext {
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public Function_call_expressionContext(Chain_postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunction_call_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunction_call_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFunction_call_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Explicit_member_expression_number_doubleContext extends Chain_postfix_expressionContext {
		public TerminalNode Floating_point_literal() { return getToken(SwiftParser.Floating_point_literal, 0); }
		public Explicit_member_expression_number_doubleContext(Chain_postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExplicit_member_expression_number_double(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExplicit_member_expression_number_double(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExplicit_member_expression_number_double(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Subscript_expressionContext extends Chain_postfix_expressionContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Subscript_expressionContext(Chain_postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSubscript_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSubscript_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSubscript_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Initializer_expressionContext extends Chain_postfix_expressionContext {
		public Initializer_expressionContext(Chain_postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInitializer_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInitializer_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInitializer_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Dynamic_type_expressionContext extends Chain_postfix_expressionContext {
		public Dynamic_type_expressionContext(Chain_postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDynamic_type_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDynamic_type_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDynamic_type_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Explicit_member_expression_numberContext extends Chain_postfix_expressionContext {
		public TerminalNode Decimal_literal() { return getToken(SwiftParser.Decimal_literal, 0); }
		public Explicit_member_expression_numberContext(Chain_postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExplicit_member_expression_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExplicit_member_expression_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExplicit_member_expression_number(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Postfix_self_expressionContext extends Chain_postfix_expressionContext {
		public Postfix_self_expressionContext(Chain_postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPostfix_self_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPostfix_self_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPostfix_self_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Chain_postfix_expressionContext chain_postfix_expression() throws RecognitionException {
		Chain_postfix_expressionContext _localctx = new Chain_postfix_expressionContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_chain_postfix_expression);
		int _la;
		try {
			setState(2198);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				_localctx = new Function_call_with_closure_expressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2138);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2137);
					match(QUESTION);
					}
				}

				setState(2141);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2140);
					parenthesized_expression();
					}
				}

				setState(2143);
				trailing_closure();
				}
				break;
			case 2:
				_localctx = new Function_call_expressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2145);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2144);
					match(QUESTION);
					}
				}

				setState(2147);
				parenthesized_expression();
				}
				break;
			case 3:
				_localctx = new Initializer_expressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2149);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2148);
					match(QUESTION);
					}
				}

				setState(2151);
				match(DOT);
				setState(2152);
				match(T__53);
				}
				break;
			case 4:
				_localctx = new Initializer_expression_with_argsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2154);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2153);
					match(QUESTION);
					}
				}

				setState(2156);
				match(DOT);
				setState(2157);
				match(T__53);
				setState(2158);
				match(LPAREN);
				setState(2159);
				argument_names();
				setState(2160);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new Explicit_member_expressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2163);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2162);
					match(QUESTION);
					}
				}

				setState(2165);
				match(DOT);
				setState(2166);
				identifier();
				setState(2168);
				switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
				case 1:
					{
					setState(2167);
					generic_argument_clause();
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new Explicit_member_expression_numberContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2171);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2170);
					match(QUESTION);
					}
				}

				setState(2173);
				match(DOT);
				setState(2174);
				match(Decimal_literal);
				}
				break;
			case 7:
				_localctx = new Explicit_member_expression_number_doubleContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2176);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2175);
					match(QUESTION);
					}
				}

				setState(2178);
				match(DOT);
				setState(2179);
				match(Floating_point_literal);
				}
				break;
			case 8:
				_localctx = new Postfix_self_expressionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(2181);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2180);
					match(QUESTION);
					}
				}

				setState(2183);
				match(DOT);
				setState(2184);
				match(T__90);
				}
				break;
			case 9:
				_localctx = new Dynamic_type_expressionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(2186);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2185);
					match(QUESTION);
					}
				}

				setState(2188);
				match(DOT);
				setState(2189);
				match(T__95);
				}
				break;
			case 10:
				_localctx = new Subscript_expressionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(2191);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2190);
					match(QUESTION);
					}
				}

				setState(2193);
				match(LBRACK);
				setState(2194);
				expression_list();
				setState(2195);
				match(RBRACK);
				}
				break;
			case 11:
				_localctx = new Chain_postfix_operatorContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(2197);
				postfix_operator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_namesContext extends ParserRuleContext {
		public Argument_nameContext argument_name() {
			return getRuleContext(Argument_nameContext.class,0);
		}
		public Argument_namesContext argument_names() {
			return getRuleContext(Argument_namesContext.class,0);
		}
		public Argument_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArgument_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArgument_names(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitArgument_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_namesContext argument_names() throws RecognitionException {
		Argument_namesContext _localctx = new Argument_namesContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_argument_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2200);
			argument_name();
			setState(2202);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__51 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__74 - 45)) | (1L << (T__76 - 45)) | (1L << (T__79 - 45)) | (1L << (T__96 - 45)) | (1L << (T__97 - 45)) | (1L << (T__98 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==Implicit_parameter_name) {
				{
				setState(2201);
				argument_names();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Argument_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArgument_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArgument_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitArgument_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_nameContext argument_name() throws RecognitionException {
		Argument_nameContext _localctx = new Argument_nameContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_argument_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2204);
			identifier();
			setState(2205);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trailing_closureContext extends ParserRuleContext {
		public Explicit_closure_expressionContext explicit_closure_expression() {
			return getRuleContext(Explicit_closure_expressionContext.class,0);
		}
		public Trailing_closureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailing_closure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTrailing_closure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTrailing_closure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTrailing_closure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trailing_closureContext trailing_closure() throws RecognitionException {
		Trailing_closureContext _localctx = new Trailing_closureContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_trailing_closure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2207);
			explicit_closure_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Array_definitionContext array_definition() {
			return getRuleContext(Array_definitionContext.class,0);
		}
		public Dictionary_definitionContext dictionary_definition() {
			return getRuleContext(Dictionary_definitionContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public Protocol_composition_typeContext protocol_composition_type() {
			return getRuleContext(Protocol_composition_typeContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public Arrow_operatorContext arrow_operator() {
			return getRuleContext(Arrow_operatorContext.class,0);
		}
		public Optional_typeContext optional_type() {
			return getRuleContext(Optional_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 442;
		enterRecursionRule(_localctx, 442, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2215);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				{
				setState(2210);
				array_definition();
				}
				break;
			case 2:
				{
				setState(2211);
				dictionary_definition();
				}
				break;
			case 3:
				{
				setState(2212);
				type_identifier();
				}
				break;
			case 4:
				{
				setState(2213);
				tuple_type();
				}
				break;
			case 5:
				{
				setState(2214);
				protocol_composition_type();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2239);
					switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2217);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2219);
						switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
						case 1:
							{
							setState(2218);
							match(T__48);
							}
							break;
						}
						setState(2221);
						arrow_operator();
						setState(2222);
						type(10);
						}
						break;
					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2224);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2225);
						match(T__49);
						setState(2226);
						arrow_operator();
						setState(2227);
						type(9);
						}
						break;
					case 3:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2229);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2230);
						optional_type();
						}
						break;
					case 4:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2231);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2232);
						match(BANG);
						}
						break;
					case 5:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2233);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2234);
						match(DOT);
						setState(2235);
						match(T__96);
						}
						break;
					case 6:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2236);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2237);
						match(DOT);
						setState(2238);
						match(T__97);
						}
						break;
					}
					} 
				}
				setState(2243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Optional_typeContext extends ParserRuleContext {
		public Optional_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOptional_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOptional_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitOptional_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_typeContext optional_type() throws RecognitionException {
		Optional_typeContext _localctx = new Optional_typeContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_optional_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2244);
			match(QUESTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_definitionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Array_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArray_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArray_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitArray_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_definitionContext array_definition() throws RecognitionException {
		Array_definitionContext _localctx = new Array_definitionContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_array_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2246);
			match(LBRACK);
			setState(2247);
			type(0);
			setState(2248);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dictionary_definitionContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public Dictionary_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDictionary_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDictionary_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDictionary_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dictionary_definitionContext dictionary_definition() throws RecognitionException {
		Dictionary_definitionContext _localctx = new Dictionary_definitionContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_dictionary_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2250);
			match(LBRACK);
			setState(2251);
			type(0);
			setState(2252);
			match(COLON);
			setState(2253);
			type(0);
			setState(2254);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_annotationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Type_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterType_annotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitType_annotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitType_annotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_annotationContext type_annotation() throws RecognitionException {
		Type_annotationContext _localctx = new Type_annotationContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_type_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2256);
			match(COLON);
			setState(2258);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				{
				setState(2257);
				attributes();
				}
				break;
			}
			setState(2260);
			type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_identifierContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Generic_argument_clauseContext generic_argument_clause() {
			return getRuleContext(Generic_argument_clauseContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Type_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterType_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitType_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitType_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_identifierContext type_identifier() throws RecognitionException {
		Type_identifierContext _localctx = new Type_identifierContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_type_identifier);
		int _la;
		try {
			setState(2273);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2262);
				type_name();
				setState(2264);
				switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
				case 1:
					{
					setState(2263);
					generic_argument_clause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2266);
				type_name();
				setState(2268);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2267);
					generic_argument_clause();
					}
				}

				setState(2270);
				match(DOT);
				setState(2271);
				type_identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2275);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_typeContext extends ParserRuleContext {
		public Tuple_type_bodyContext tuple_type_body() {
			return getRuleContext(Tuple_type_bodyContext.class,0);
		}
		public Tuple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTuple_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTuple_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTuple_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_typeContext tuple_type() throws RecognitionException {
		Tuple_typeContext _localctx = new Tuple_typeContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_tuple_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2277);
			match(LPAREN);
			setState(2279);
			_la = _input.LA(1);
			if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (T__42 - 43)) | (1L << (T__44 - 43)) | (1L << (T__45 - 43)) | (1L << (T__46 - 43)) | (1L << (T__47 - 43)) | (1L << (T__50 - 43)) | (1L << (T__51 - 43)) | (1L << (T__57 - 43)) | (1L << (T__58 - 43)) | (1L << (T__59 - 43)) | (1L << (T__60 - 43)) | (1L << (T__61 - 43)) | (1L << (T__62 - 43)) | (1L << (T__63 - 43)) | (1L << (T__64 - 43)) | (1L << (T__65 - 43)) | (1L << (T__66 - 43)) | (1L << (T__67 - 43)) | (1L << (T__68 - 43)) | (1L << (T__69 - 43)) | (1L << (T__70 - 43)) | (1L << (T__71 - 43)) | (1L << (T__72 - 43)) | (1L << (T__73 - 43)) | (1L << (T__74 - 43)) | (1L << (T__76 - 43)) | (1L << (T__79 - 43)) | (1L << (T__96 - 43)) | (1L << (T__97 - 43)) | (1L << (T__98 - 43)) | (1L << (Regular_identifier - 43)))) != 0) || ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (LPAREN - 107)) | (1L << (LBRACK - 107)) | (1L << (AT - 107)) | (1L << (Implicit_parameter_name - 107)))) != 0)) {
				{
				setState(2278);
				tuple_type_body();
				}
			}

			setState(2281);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_type_bodyContext extends ParserRuleContext {
		public Tuple_type_element_listContext tuple_type_element_list() {
			return getRuleContext(Tuple_type_element_listContext.class,0);
		}
		public Range_operatorContext range_operator() {
			return getRuleContext(Range_operatorContext.class,0);
		}
		public Tuple_type_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTuple_type_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTuple_type_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTuple_type_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_type_bodyContext tuple_type_body() throws RecognitionException {
		Tuple_type_bodyContext _localctx = new Tuple_type_bodyContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_tuple_type_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2283);
			tuple_type_element_list();
			setState(2285);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				{
				setState(2284);
				range_operator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_type_element_listContext extends ParserRuleContext {
		public Tuple_type_elementContext tuple_type_element() {
			return getRuleContext(Tuple_type_elementContext.class,0);
		}
		public Tuple_type_element_listContext tuple_type_element_list() {
			return getRuleContext(Tuple_type_element_listContext.class,0);
		}
		public Tuple_type_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type_element_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTuple_type_element_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTuple_type_element_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTuple_type_element_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_type_element_listContext tuple_type_element_list() throws RecognitionException {
		Tuple_type_element_listContext _localctx = new Tuple_type_element_listContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_tuple_type_element_list);
		try {
			setState(2292);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2287);
				tuple_type_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2288);
				tuple_type_element();
				setState(2289);
				match(COMMA);
				setState(2290);
				tuple_type_element_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_type_elementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Element_nameContext element_name() {
			return getRuleContext(Element_nameContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Tuple_type_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTuple_type_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTuple_type_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTuple_type_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_type_elementContext tuple_type_element() throws RecognitionException {
		Tuple_type_elementContext _localctx = new Tuple_type_elementContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_tuple_type_element);
		int _la;
		try {
			setState(2307);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2295);
				switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
				case 1:
					{
					setState(2294);
					attributes();
					}
					break;
				}
				setState(2298);
				_la = _input.LA(1);
				if (_la==T__50) {
					{
					setState(2297);
					match(T__50);
					}
				}

				setState(2300);
				type(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2302);
				_la = _input.LA(1);
				if (_la==T__50) {
					{
					setState(2301);
					match(T__50);
					}
				}

				setState(2304);
				element_name();
				setState(2305);
				type_annotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Element_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Element_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterElement_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitElement_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitElement_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_nameContext element_name() throws RecognitionException {
		Element_nameContext _localctx = new Element_nameContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_element_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2309);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_composition_typeContext extends ParserRuleContext {
		public Protocol_identifier_listContext protocol_identifier_list() {
			return getRuleContext(Protocol_identifier_listContext.class,0);
		}
		public Protocol_composition_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_composition_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_composition_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_composition_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_composition_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_composition_typeContext protocol_composition_type() throws RecognitionException {
		Protocol_composition_typeContext _localctx = new Protocol_composition_typeContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_protocol_composition_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2311);
			match(T__42);
			setState(2312);
			match(LT);
			setState(2314);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__51 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__74 - 45)) | (1L << (T__76 - 45)) | (1L << (T__79 - 45)) | (1L << (T__96 - 45)) | (1L << (T__97 - 45)) | (1L << (T__98 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==COMMA || _la==Implicit_parameter_name) {
				{
				setState(2313);
				protocol_identifier_list();
				}
			}

			setState(2316);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_identifier_listContext extends ParserRuleContext {
		public List<Protocol_identifierContext> protocol_identifier() {
			return getRuleContexts(Protocol_identifierContext.class);
		}
		public Protocol_identifierContext protocol_identifier(int i) {
			return getRuleContext(Protocol_identifierContext.class,i);
		}
		public Protocol_identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_identifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_identifier_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_identifier_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_identifier_listContext protocol_identifier_list() throws RecognitionException {
		Protocol_identifier_listContext _localctx = new Protocol_identifier_listContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_protocol_identifier_list);
		int _la;
		try {
			setState(2325);
			switch (_input.LA(1)) {
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__51:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__76:
			case T__79:
			case T__96:
			case T__97:
			case T__98:
			case Regular_identifier:
			case Implicit_parameter_name:
				enterOuterAlt(_localctx, 1);
				{
				setState(2318);
				protocol_identifier();
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(2321); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2319);
					match(COMMA);
					setState(2320);
					protocol_identifier();
					}
					}
					setState(2323); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_identifierContext extends ParserRuleContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Protocol_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_identifierContext protocol_identifier() throws RecognitionException {
		Protocol_identifierContext _localctx = new Protocol_identifierContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_protocol_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2327);
			type_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_inheritance_clauseContext extends ParserRuleContext {
		public Class_requirementContext class_requirement() {
			return getRuleContext(Class_requirementContext.class,0);
		}
		public Type_inheritance_listContext type_inheritance_list() {
			return getRuleContext(Type_inheritance_listContext.class,0);
		}
		public Type_inheritance_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_inheritance_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterType_inheritance_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitType_inheritance_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitType_inheritance_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_inheritance_clauseContext type_inheritance_clause() throws RecognitionException {
		Type_inheritance_clauseContext _localctx = new Type_inheritance_clauseContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_type_inheritance_clause);
		try {
			setState(2338);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2329);
				match(COLON);
				setState(2330);
				class_requirement();
				setState(2331);
				match(COMMA);
				setState(2332);
				type_inheritance_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2334);
				match(COLON);
				setState(2335);
				class_requirement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2336);
				match(COLON);
				setState(2337);
				type_inheritance_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_inheritance_listContext extends ParserRuleContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Type_inheritance_listContext type_inheritance_list() {
			return getRuleContext(Type_inheritance_listContext.class,0);
		}
		public Type_inheritance_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_inheritance_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterType_inheritance_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitType_inheritance_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitType_inheritance_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_inheritance_listContext type_inheritance_list() throws RecognitionException {
		Type_inheritance_listContext _localctx = new Type_inheritance_listContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_type_inheritance_list);
		try {
			setState(2345);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2340);
				type_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2341);
				type_identifier();
				setState(2342);
				match(COMMA);
				setState(2343);
				type_inheritance_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_requirementContext extends ParserRuleContext {
		public Class_requirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClass_requirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClass_requirement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitClass_requirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_requirementContext class_requirement() throws RecognitionException {
		Class_requirementContext _localctx = new Class_requirementContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_class_requirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2347);
			match(T__40);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Escaped_parameterContext extends IdentifierContext {
		public TerminalNode Regular_identifier() { return getToken(SwiftParser.Regular_identifier, 0); }
		public Escaped_parameterContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterEscaped_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitEscaped_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitEscaped_parameter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Implicit_parameterContext extends IdentifierContext {
		public TerminalNode Implicit_parameter_name() { return getToken(SwiftParser.Implicit_parameter_name, 0); }
		public Implicit_parameterContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImplicit_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImplicit_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitImplicit_parameter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Regular_parameterContext extends IdentifierContext {
		public TerminalNode Regular_identifier() { return getToken(SwiftParser.Regular_identifier, 0); }
		public Regular_parameterContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRegular_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRegular_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRegular_parameter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Context_sensitive_keyword_parameterContext extends IdentifierContext {
		public Context_sensitive_keywordContext context_sensitive_keyword() {
			return getRuleContext(Context_sensitive_keywordContext.class,0);
		}
		public Context_sensitive_keyword_parameterContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterContext_sensitive_keyword_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitContext_sensitive_keyword_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitContext_sensitive_keyword_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_identifier);
		try {
			setState(2355);
			switch (_input.LA(1)) {
			case Regular_identifier:
				_localctx = new Regular_parameterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2349);
				match(Regular_identifier);
				}
				break;
			case T__98:
				_localctx = new Escaped_parameterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2350);
				match(T__98);
				setState(2351);
				match(Regular_identifier);
				setState(2352);
				match(T__98);
				}
				break;
			case Implicit_parameter_name:
				_localctx = new Implicit_parameterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2353);
				match(Implicit_parameter_name);
				}
				break;
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__51:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__76:
			case T__79:
			case T__96:
			case T__97:
				_localctx = new Context_sensitive_keyword_parameterContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2354);
				context_sensitive_keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_listContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIdentifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIdentifier_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitIdentifier_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_identifier_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2357);
			identifier();
			setState(2362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2358);
					match(COMMA);
					setState(2359);
					identifier();
					}
					} 
				}
				setState(2364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Context_sensitive_keywordContext extends ParserRuleContext {
		public Context_sensitive_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context_sensitive_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterContext_sensitive_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitContext_sensitive_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitContext_sensitive_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Context_sensitive_keywordContext context_sensitive_keyword() throws RecognitionException {
		Context_sensitive_keywordContext _localctx = new Context_sensitive_keywordContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_context_sensitive_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2365);
			_la = _input.LA(1);
			if ( !(((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__51 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__74 - 45)) | (1L << (T__76 - 45)) | (1L << (T__79 - 45)) | (1L << (T__96 - 45)) | (1L << (T__97 - 45)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAssignment_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_assignment_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2367);
			if (!(SwiftSupport.isBinaryOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isBinaryOp(_input)");
			setState(2368);
			match(EQUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Negate_prefix_operatorContext extends ParserRuleContext {
		public Negate_prefix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negate_prefix_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterNegate_prefix_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitNegate_prefix_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitNegate_prefix_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Negate_prefix_operatorContext negate_prefix_operator() throws RecognitionException {
		Negate_prefix_operatorContext _localctx = new Negate_prefix_operatorContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_negate_prefix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2370);
			if (!(SwiftSupport.isPrefixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPrefixOp(_input)");
			setState(2371);
			match(SUB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Build_ANDContext extends ParserRuleContext {
		public Build_ANDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_AND; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBuild_AND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBuild_AND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBuild_AND(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_ANDContext build_AND() throws RecognitionException {
		Build_ANDContext _localctx = new Build_ANDContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_build_AND);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2373);
			if (!(SwiftSupport.isOperator(_input,"&&"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"&&\")");
			setState(2374);
			match(AND);
			setState(2375);
			match(AND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Build_ORContext extends ParserRuleContext {
		public Build_ORContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_OR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBuild_OR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBuild_OR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBuild_OR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_ORContext build_OR() throws RecognitionException {
		Build_ORContext _localctx = new Build_ORContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_build_OR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2377);
			if (!(SwiftSupport.isOperator(_input,"||"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"||\")");
			setState(2378);
			match(OR);
			setState(2379);
			match(OR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arrow_operatorContext extends ParserRuleContext {
		public Arrow_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArrow_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArrow_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitArrow_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arrow_operatorContext arrow_operator() throws RecognitionException {
		Arrow_operatorContext _localctx = new Arrow_operatorContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_arrow_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2381);
			if (!(SwiftSupport.isOperator(_input,"->"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"->\")");
			setState(2382);
			match(SUB);
			setState(2383);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Range_operatorContext extends ParserRuleContext {
		public Range_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRange_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRange_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRange_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_operatorContext range_operator() throws RecognitionException {
		Range_operatorContext _localctx = new Range_operatorContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_range_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2385);
			if (!(SwiftSupport.isOperator(_input,"..."))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"...\")");
			setState(2386);
			match(DOT);
			setState(2387);
			match(DOT);
			setState(2388);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Same_type_equalsContext extends ParserRuleContext {
		public Same_type_equalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_same_type_equals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSame_type_equals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSame_type_equals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSame_type_equals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Same_type_equalsContext same_type_equals() throws RecognitionException {
		Same_type_equalsContext _localctx = new Same_type_equalsContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_same_type_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2390);
			if (!(SwiftSupport.isOperator(_input,"=="))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"==\")");
			setState(2391);
			match(EQUAL);
			setState(2392);
			match(EQUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_operatorContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBinary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBinary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBinary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_operatorContext binary_operator() throws RecognitionException {
		Binary_operatorContext _localctx = new Binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_binary_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2394);
			if (!(SwiftSupport.isBinaryOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isBinaryOp(_input)");
			setState(2395);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prefix_operatorContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Prefix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrefix_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrefix_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPrefix_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_operatorContext prefix_operator() throws RecognitionException {
		Prefix_operatorContext _localctx = new Prefix_operatorContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_prefix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2397);
			if (!(SwiftSupport.isPrefixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPrefixOp(_input)");
			setState(2398);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_operatorContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Postfix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPostfix_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPostfix_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPostfix_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_operatorContext postfix_operator() throws RecognitionException {
		Postfix_operatorContext _localctx = new Postfix_operatorContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_postfix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2400);
			if (!(SwiftSupport.isPostfixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPostfixOp(_input)");
			setState(2401);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public Operator_headContext operator_head() {
			return getRuleContext(Operator_headContext.class,0);
		}
		public List<Operator_characterContext> operator_character() {
			return getRuleContexts(Operator_characterContext.class);
		}
		public Operator_characterContext operator_character(int i) {
			return getRuleContext(Operator_characterContext.class,i);
		}
		public Dot_operator_headContext dot_operator_head() {
			return getRuleContext(Dot_operator_headContext.class,0);
		}
		public List<Dot_operator_characterContext> dot_operator_character() {
			return getRuleContexts(Dot_operator_characterContext.class);
		}
		public Dot_operator_characterContext dot_operator_character(int i) {
			return getRuleContext(Dot_operator_characterContext.class,i);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 504, RULE_operator);
		try {
			int _alt;
			setState(2419);
			switch (_input.LA(1)) {
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
			case Operator_head_other:
				enterOuterAlt(_localctx, 1);
				{
				setState(2403);
				operator_head();
				setState(2408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2404);
						if (!(_input.get(_input.index()-1).getType()!=WS)) throw new FailedPredicateException(this, "_input.get(_input.index()-1).getType()!=WS");
						setState(2405);
						operator_character();
						}
						} 
					}
					setState(2410);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
				}
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2411);
				dot_operator_head();
				setState(2416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2412);
						if (!(_input.get(_input.index()-1).getType()!=WS)) throw new FailedPredicateException(this, "_input.get(_input.index()-1).getType()!=WS");
						setState(2413);
						dot_operator_character();
						}
						} 
					}
					setState(2418);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator_characterContext extends ParserRuleContext {
		public Operator_headContext operator_head() {
			return getRuleContext(Operator_headContext.class,0);
		}
		public TerminalNode Operator_following_character() { return getToken(SwiftParser.Operator_following_character, 0); }
		public Operator_characterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOperator_character(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOperator_character(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitOperator_character(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_characterContext operator_character() throws RecognitionException {
		Operator_characterContext _localctx = new Operator_characterContext(_ctx, getState());
		enterRule(_localctx, 506, RULE_operator_character);
		try {
			setState(2423);
			switch (_input.LA(1)) {
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
			case Operator_head_other:
				enterOuterAlt(_localctx, 1);
				{
				setState(2421);
				operator_head();
				}
				break;
			case Operator_following_character:
				enterOuterAlt(_localctx, 2);
				{
				setState(2422);
				match(Operator_following_character);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator_headContext extends ParserRuleContext {
		public TerminalNode Operator_head_other() { return getToken(SwiftParser.Operator_head_other, 0); }
		public Operator_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOperator_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOperator_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitOperator_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_headContext operator_head() throws RecognitionException {
		Operator_headContext _localctx = new Operator_headContext(_ctx, getState());
		enterRule(_localctx, 508, RULE_operator_head);
		int _la;
		try {
			setState(2427);
			switch (_input.LA(1)) {
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2425);
				_la = _input.LA(1);
				if ( !(((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (LT - 115)) | (1L << (GT - 115)) | (1L << (BANG - 115)) | (1L << (QUESTION - 115)) | (1L << (AND - 115)) | (1L << (SUB - 115)) | (1L << (EQUAL - 115)) | (1L << (OR - 115)) | (1L << (DIV - 115)) | (1L << (ADD - 115)) | (1L << (MUL - 115)) | (1L << (MOD - 115)) | (1L << (CARET - 115)) | (1L << (TILDE - 115)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case Operator_head_other:
				enterOuterAlt(_localctx, 2);
				{
				setState(2426);
				match(Operator_head_other);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dot_operator_headContext extends ParserRuleContext {
		public Dot_operator_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_operator_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDot_operator_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDot_operator_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDot_operator_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_operator_headContext dot_operator_head() throws RecognitionException {
		Dot_operator_headContext _localctx = new Dot_operator_headContext(_ctx, getState());
		enterRule(_localctx, 510, RULE_dot_operator_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2429);
			match(DOT);
			setState(2430);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dot_operator_characterContext extends ParserRuleContext {
		public Operator_characterContext operator_character() {
			return getRuleContext(Operator_characterContext.class,0);
		}
		public Dot_operator_characterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_operator_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDot_operator_character(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDot_operator_character(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDot_operator_character(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_operator_characterContext dot_operator_character() throws RecognitionException {
		Dot_operator_characterContext _localctx = new Dot_operator_characterContext(_ctx, getState());
		enterRule(_localctx, 512, RULE_dot_operator_character);
		try {
			setState(2434);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2432);
				match(DOT);
				}
				break;
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
			case Operator_head_other:
			case Operator_following_character:
				enterOuterAlt(_localctx, 2);
				{
				setState(2433);
				operator_character();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Nil_literalContext nil_literal() {
			return getRuleContext(Nil_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 514, RULE_literal);
		try {
			setState(2440);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2436);
				numeric_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2437);
				string_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2438);
				boolean_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2439);
				nil_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_literalContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Negate_prefix_operatorContext negate_prefix_operator() {
			return getRuleContext(Negate_prefix_operatorContext.class,0);
		}
		public TerminalNode Floating_point_literal() { return getToken(SwiftParser.Floating_point_literal, 0); }
		public Numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterNumeric_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitNumeric_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitNumeric_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 516, RULE_numeric_literal);
		try {
			setState(2450);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2443);
				switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
				case 1:
					{
					setState(2442);
					negate_prefix_operator();
					}
					break;
				}
				setState(2445);
				integer_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2447);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(2446);
					negate_prefix_operator();
					}
					break;
				}
				setState(2449);
				match(Floating_point_literal);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_literalContext extends ParserRuleContext {
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 518, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2452);
			_la = _input.LA(1);
			if ( !(_la==T__99 || _la==T__100) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nil_literalContext extends ParserRuleContext {
		public Nil_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterNil_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitNil_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitNil_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nil_literalContext nil_literal() throws RecognitionException {
		Nil_literalContext _localctx = new Nil_literalContext(_ctx, getState());
		enterRule(_localctx, 520, RULE_nil_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2454);
			match(T__101);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_literalContext extends ParserRuleContext {
		public TerminalNode Binary_literal() { return getToken(SwiftParser.Binary_literal, 0); }
		public TerminalNode Octal_literal() { return getToken(SwiftParser.Octal_literal, 0); }
		public TerminalNode Decimal_literal() { return getToken(SwiftParser.Decimal_literal, 0); }
		public TerminalNode Pure_decimal_digits() { return getToken(SwiftParser.Pure_decimal_digits, 0); }
		public TerminalNode Hexadecimal_literal() { return getToken(SwiftParser.Hexadecimal_literal, 0); }
		public Integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInteger_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInteger_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInteger_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_literalContext integer_literal() throws RecognitionException {
		Integer_literalContext _localctx = new Integer_literalContext(_ctx, getState());
		enterRule(_localctx, 522, RULE_integer_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2456);
			_la = _input.LA(1);
			if ( !(((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (Binary_literal - 134)) | (1L << (Octal_literal - 134)) | (1L << (Decimal_literal - 134)) | (1L << (Pure_decimal_digits - 134)) | (1L << (Hexadecimal_literal - 134)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode Static_string_literal() { return getToken(SwiftParser.Static_string_literal, 0); }
		public TerminalNode Interpolated_string_literal() { return getToken(SwiftParser.Interpolated_string_literal, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitString_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 524, RULE_string_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2458);
			_la = _input.LA(1);
			if ( !(_la==Static_string_literal || _la==Interpolated_string_literal) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 50:
			return build_configuration_sempred((Build_configurationContext)_localctx, predIndex);
		case 164:
			return pattern_sempred((PatternContext)_localctx, predIndex);
		case 216:
			return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
		case 221:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 242:
			return assignment_operator_sempred((Assignment_operatorContext)_localctx, predIndex);
		case 243:
			return negate_prefix_operator_sempred((Negate_prefix_operatorContext)_localctx, predIndex);
		case 244:
			return build_AND_sempred((Build_ANDContext)_localctx, predIndex);
		case 245:
			return build_OR_sempred((Build_ORContext)_localctx, predIndex);
		case 246:
			return arrow_operator_sempred((Arrow_operatorContext)_localctx, predIndex);
		case 247:
			return range_operator_sempred((Range_operatorContext)_localctx, predIndex);
		case 248:
			return same_type_equals_sempred((Same_type_equalsContext)_localctx, predIndex);
		case 249:
			return binary_operator_sempred((Binary_operatorContext)_localctx, predIndex);
		case 250:
			return prefix_operator_sempred((Prefix_operatorContext)_localctx, predIndex);
		case 251:
			return postfix_operator_sempred((Postfix_operatorContext)_localctx, predIndex);
		case 252:
			return operator_sempred((OperatorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean build_configuration_sempred(Build_configurationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean pattern_sempred(PatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean postfix_expression_sempred(Postfix_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assignment_operator_sempred(Assignment_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return SwiftSupport.isBinaryOp(_input);
		}
		return true;
	}
	private boolean negate_prefix_operator_sempred(Negate_prefix_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return SwiftSupport.isPrefixOp(_input);
		}
		return true;
	}
	private boolean build_AND_sempred(Build_ANDContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return SwiftSupport.isOperator(_input,"&&");
		}
		return true;
	}
	private boolean build_OR_sempred(Build_ORContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return SwiftSupport.isOperator(_input,"||");
		}
		return true;
	}
	private boolean arrow_operator_sempred(Arrow_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return SwiftSupport.isOperator(_input,"->");
		}
		return true;
	}
	private boolean range_operator_sempred(Range_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return SwiftSupport.isOperator(_input,"...");
		}
		return true;
	}
	private boolean same_type_equals_sempred(Same_type_equalsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return SwiftSupport.isOperator(_input,"==");
		}
		return true;
	}
	private boolean binary_operator_sempred(Binary_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return SwiftSupport.isBinaryOp(_input);
		}
		return true;
	}
	private boolean prefix_operator_sempred(Prefix_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return SwiftSupport.isPrefixOp(_input);
		}
		return true;
	}
	private boolean postfix_operator_sempred(Postfix_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return SwiftSupport.isPostfixOp(_input);
		}
		return true;
	}
	private boolean operator_sempred(OperatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return _input.get(_input.index()-1).getType()!=WS;
		case 21:
			return _input.get(_input.index()-1).getType()!=WS;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0092\u099f\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa"+
		"\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\4\u00fd\t\u00fd\4\u00fe\t\u00fe"+
		"\4\u00ff\t\u00ff\4\u0100\t\u0100\4\u0101\t\u0101\4\u0102\t\u0102\4\u0103"+
		"\t\u0103\4\u0104\t\u0104\4\u0105\t\u0105\4\u0106\t\u0106\4\u0107\t\u0107"+
		"\4\u0108\t\u0108\3\2\7\2\u0212\n\2\f\2\16\2\u0215\13\2\3\2\3\2\3\3\3\3"+
		"\5\3\u021b\n\3\3\3\3\3\5\3\u021f\n\3\3\3\3\3\5\3\u0223\n\3\3\3\3\3\5\3"+
		"\u0227\n\3\3\3\3\3\5\3\u022b\n\3\3\3\3\3\5\3\u022f\n\3\3\3\3\3\5\3\u0233"+
		"\n\3\3\3\3\3\5\3\u0237\n\3\3\3\5\3\u023a\n\3\3\4\6\4\u023d\n\4\r\4\16"+
		"\4\u023e\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u0247\n\6\3\7\3\7\5\7\u024b\n\7\3"+
		"\7\3\7\5\7\u024f\n\7\3\7\3\7\5\7\u0253\n\7\3\7\3\7\3\7\3\7\5\7\u0259\n"+
		"\7\3\7\3\7\5\7\u025d\n\7\3\7\3\7\5\7\u0261\n\7\3\7\3\7\5\7\u0265\n\7\3"+
		"\b\3\b\5\b\u0269\n\b\3\t\3\t\5\t\u026d\n\t\3\t\3\t\3\t\3\t\5\t\u0273\n"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u0285\n\13\3\f\3\f\3\f\7\f\u028a\n\f\f\f\16\f\u028d\13\f\3"+
		"\r\3\r\3\r\5\r\u0292\n\r\3\16\3\16\3\16\3\16\5\16\u0298\n\16\3\17\3\17"+
		"\5\17\u029c\n\17\3\17\5\17\u029f\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u02a9\n\20\3\21\3\21\3\21\3\21\7\21\u02af\n\21\f\21\16\21"+
		"\u02b2\13\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u02bc\n\23\3"+
		"\24\3\24\3\24\3\24\5\24\u02c2\n\24\3\25\3\25\3\25\3\25\5\25\u02c8\n\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u02d3\n\27\3\27\3\27"+
		"\3\30\3\30\5\30\u02d9\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u02e1\n"+
		"\31\3\32\3\32\3\32\3\32\3\33\3\33\5\33\u02e9\n\33\3\33\3\33\5\33\u02ed"+
		"\n\33\3\33\3\33\3\33\5\33\u02f2\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0305\n\37\3 "+
		"\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\5\"\u0311\n\"\3#\3#\5#\u0315\n#\3$\3"+
		"$\5$\u0319\n$\3%\3%\3&\3&\5&\u031f\n&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\7("+
		"\u0329\n(\f(\16(\u032c\13(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\5,\u0339\n"+
		",\3-\3-\5-\u033d\n-\3.\3.\5.\u0341\n.\3.\5.\u0344\n.\3.\3.\3/\3/\5/\u034a"+
		"\n/\3\60\3\60\3\60\5\60\u034f\n\60\3\60\5\60\u0352\n\60\3\60\5\60\u0355"+
		"\n\60\3\60\3\60\3\61\3\61\5\61\u035b\n\61\3\62\3\62\3\62\5\62\u0360\n"+
		"\62\3\63\3\63\5\63\u0364\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\5\64\u0370\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\7\64"+
		"\u037a\n\64\f\64\16\64\u037d\13\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\5\65\u0389\n\65\3\66\3\66\3\67\3\67\38\38\38\38\38\58"+
		"\u0394\n8\39\39\3:\3:\3;\3;\3;\5;\u039d\n;\3;\3;\3<\3<\3<\7<\u03a4\n<"+
		"\f<\16<\u03a7\13<\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u03b2\n=\3>\3>\3>\3?\3"+
		"?\3?\3?\3?\5?\u03bc\n?\3@\3@\5@\u03c0\n@\3A\3A\3A\3A\3A\3A\3A\3A\5A\u03ca"+
		"\nA\3B\3B\3B\3B\3C\3C\3C\3C\3D\3D\3D\7D\u03d7\nD\fD\16D\u03da\13D\3E\3"+
		"E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u03ec\nF\3G\6G\u03ef\n"+
		"G\rG\16G\u03f0\3H\5H\u03f4\nH\3I\3I\5I\u03f8\nI\3I\3I\3J\5J\u03fd\nJ\3"+
		"J\3J\5J\u0401\nJ\3J\3J\3K\3K\3L\3L\3L\3L\3L\5L\u040c\nL\3M\3M\5M\u0410"+
		"\nM\3N\5N\u0413\nN\3N\5N\u0416\nN\3N\3N\3N\3O\3O\3O\7O\u041e\nO\fO\16"+
		"O\u0421\13O\3P\3P\5P\u0425\nP\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3"+
		"R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u0440\nR\3R\3R\3R\3R\3R\3R\3R\5"+
		"R\u0449\nR\3R\3R\5R\u044d\nR\3S\5S\u0450\nS\3S\5S\u0453\nS\3S\3S\3T\3"+
		"T\3U\3U\3U\5U\u045c\nU\3U\3U\3U\3U\3U\3U\3U\5U\u0465\nU\3V\5V\u0468\n"+
		"V\3V\3V\3V\3W\5W\u046e\nW\3W\3W\5W\u0472\nW\3W\3W\3X\3X\3X\3X\3Y\3Y\3"+
		"Y\5Y\u047d\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0486\nY\3Z\5Z\u0489\nZ\3Z\3Z\3"+
		"[\5[\u048e\n[\3[\3[\3\\\3\\\3\\\5\\\u0495\n\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\5\\\u049e\n\\\3]\5]\u04a1\n]\3]\3]\5]\u04a5\n]\3]\3]\3^\5^\u04aa"+
		"\n^\3^\3^\5^\u04ae\n^\3^\3^\3_\3_\3_\3`\5`\u04b6\n`\3`\5`\u04b9\n`\3`"+
		"\3`\3`\3a\3a\3b\3b\3b\3c\3c\3c\5c\u04c6\nc\3c\3c\5c\u04ca\nc\3d\5d\u04cd"+
		"\nd\3d\5d\u04d0\nd\3d\3d\3e\3e\5e\u04d6\ne\3f\3f\5f\u04da\nf\3f\5f\u04dd"+
		"\nf\3f\3f\3f\5f\u04e2\nf\5f\u04e4\nf\3g\3g\5g\u04e8\ng\3g\3g\3h\3h\3i"+
		"\3i\5i\u04f0\ni\3j\3j\3j\3j\3j\3j\5j\u04f8\nj\3k\3k\3k\7k\u04fd\nk\fk"+
		"\16k\u0500\13k\3l\5l\u0503\nl\3l\5l\u0506\nl\3l\3l\5l\u050a\nl\3l\5l\u050d"+
		"\nl\3l\3l\5l\u0511\nl\3l\3l\5l\u0515\nl\3l\5l\u0518\nl\3l\3l\5l\u051c"+
		"\nl\3l\3l\3l\3l\5l\u0522\nl\3l\3l\3l\3l\5l\u0528\nl\3m\3m\5m\u052c\nm"+
		"\3n\3n\5n\u0530\nn\3o\3o\3o\3p\5p\u0536\np\3p\5p\u0539\np\3p\3p\5p\u053d"+
		"\np\3p\5p\u0540\np\3p\5p\u0543\np\3q\5q\u0546\nq\3q\3q\3q\5q\u054b\nq"+
		"\3q\5q\u054e\nq\3q\3q\5q\u0552\nq\3q\3q\3r\3r\5r\u0558\nr\3s\3s\5s\u055c"+
		"\ns\3t\5t\u055f\nt\3t\5t\u0562\nt\3t\3t\3t\3u\3u\3u\3u\3u\5u\u056c\nu"+
		"\3v\3v\5v\u0570\nv\3w\3w\3x\3x\3y\3y\3y\5y\u0579\ny\3y\3y\3y\3y\3y\3z"+
		"\3z\5z\u0582\nz\3{\3{\5{\u0586\n{\3|\5|\u0589\n|\3|\3|\3|\3}\3}\3}\3}"+
		"\3}\5}\u0593\n}\3~\3~\5~\u0597\n~\3\177\3\177\3\177\3\u0080\3\u0080\3"+
		"\u0080\5\u0080\u059f\n\u0080\3\u0081\5\u0081\u05a2\n\u0081\3\u0081\5\u0081"+
		"\u05a5\n\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u05aa\n\u0081\3\u0081\5"+
		"\u0081\u05ad\n\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083\5"+
		"\u0083\u05b5\n\u0083\3\u0083\3\u0083\3\u0084\5\u0084\u05ba\n\u0084\3\u0084"+
		"\5\u0084\u05bd\n\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u05c2\n\u0084\3"+
		"\u0084\5\u0084\u05c5\n\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3"+
		"\u0086\5\u0086\u05cd\n\u0086\3\u0086\3\u0086\3\u0087\5\u0087\u05d2\n\u0087"+
		"\3\u0087\5\u0087\u05d5\n\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u05da\n"+
		"\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0089\3\u0089\5\u0089\u05e2\n"+
		"\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a"+
		"\u05eb\n\u008a\3\u008b\3\u008b\5\u008b\u05ef\n\u008b\3\u008c\3\u008c\3"+
		"\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\5\u008d\u05f9\n\u008d\3"+
		"\u008d\3\u008d\3\u008e\3\u008e\5\u008e\u05ff\n\u008e\3\u008e\3\u008e\5"+
		"\u008e\u0603\n\u008e\3\u008e\3\u008e\5\u008e\u0607\n\u008e\3\u008e\3\u008e"+
		"\3\u008e\5\u008e\u060c\n\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090"+
		"\5\u0090\u0613\n\u0090\3\u0090\5\u0090\u0616\n\u0090\3\u0090\3\u0090\3"+
		"\u0090\5\u0090\u061b\n\u0090\3\u0090\5\u0090\u061e\n\u0090\3\u0091\3\u0091"+
		"\5\u0091\u0622\n\u0091\3\u0091\3\u0091\5\u0091\u0626\n\u0091\3\u0091\3"+
		"\u0091\3\u0091\3\u0091\5\u0091\u062c\n\u0091\3\u0091\3\u0091\3\u0091\3"+
		"\u0091\5\u0091\u0632\n\u0091\3\u0092\5\u0092\u0635\n\u0092\3\u0092\5\u0092"+
		"\u0638\n\u0092\3\u0092\3\u0092\5\u0092\u063c\n\u0092\3\u0092\5\u0092\u063f"+
		"\n\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u0644\n\u0092\3\u0092\5\u0092"+
		"\u0647\n\u0092\3\u0092\3\u0092\5\u0092\u064b\n\u0092\3\u0093\3\u0093\3"+
		"\u0094\5\u0094\u0650\n\u0094\3\u0094\3\u0094\3\u0094\3\u0095\5\u0095\u0656"+
		"\n\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u065b\n\u0095\3\u0095\3\u0095"+
		"\3\u0096\3\u0096\5\u0096\u0661\n\u0096\3\u0096\3\u0096\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\5\u0097\u0671\n\u0097\3\u0098\5\u0098\u0674\n\u0098\3\u0098\5"+
		"\u0098\u0677\n\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\5\u0099\u067e"+
		"\n\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\5\u009a\u0685\n\u009a"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009e\5\u009e\u069b\n\u009e\3\u009e\5\u009e\u069e\n\u009e\3"+
		"\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a2"+
		"\3\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3"+
		"\u06c3\n\u00a3\3\u00a4\3\u00a4\5\u00a4\u06c7\n\u00a4\3\u00a5\3\u00a5\3"+
		"\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u06d8\n\u00a5\3\u00a6\3\u00a6"+
		"\3\u00a6\5\u00a6\u06dd\n\u00a6\3\u00a6\3\u00a6\5\u00a6\u06e1\n\u00a6\3"+
		"\u00a6\3\u00a6\3\u00a6\5\u00a6\u06e6\n\u00a6\3\u00a6\3\u00a6\3\u00a6\3"+
		"\u00a6\3\u00a6\5\u00a6\u06ed\n\u00a6\3\u00a6\3\u00a6\3\u00a6\7\u00a6\u06f2"+
		"\n\u00a6\f\u00a6\16\u00a6\u06f5\13\u00a6\3\u00a7\3\u00a7\3\u00a8\3\u00a8"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u06ff\n\u00a9\3\u00aa\3\u00aa"+
		"\5\u00aa\u0703\n\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab\7\u00ab"+
		"\u070a\n\u00ab\f\u00ab\16\u00ab\u070d\13\u00ab\3\u00ac\3\u00ac\3\u00ad"+
		"\5\u00ad\u0712\n\u00ad\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u0717\n\u00ad\3"+
		"\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00b0\5\u00b0\u071f\n\u00b0\3"+
		"\u00b0\3\u00b0\5\u00b0\u0723\n\u00b0\3\u00b1\3\u00b1\3\u00b2\3\u00b2\5"+
		"\u00b2\u0729\n\u00b2\3\u00b2\3\u00b2\3\u00b3\6\u00b3\u072e\n\u00b3\r\u00b3"+
		"\16\u00b3\u072f\3\u00b4\6\u00b4\u0733\n\u00b4\r\u00b4\16\u00b4\u0734\3"+
		"\u00b5\3\u00b5\5\u00b5\u0739\n\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u073e"+
		"\n\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u0743\n\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u074b\n\u00b5\3\u00b6\5\u00b6"+
		"\u074e\n\u00b6\3\u00b6\3\u00b6\5\u00b6\u0752\n\u00b6\3\u00b7\3\u00b7\3"+
		"\u00b7\7\u00b7\u0757\n\u00b7\f\u00b7\16\u00b7\u075a\13\u00b7\3\u00b8\3"+
		"\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u0761\n\u00b8\3\u00b9\3\u00b9\3"+
		"\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u076b\n\u00ba\3"+
		"\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u0772\n\u00bb\3\u00bb\3"+
		"\u00bb\3\u00bb\5\u00bb\u0777\n\u00bb\3\u00bc\6\u00bc\u077a\n\u00bc\r\u00bc"+
		"\16\u00bc\u077b\3\u00bd\3\u00bd\5\u00bd\u0780\n\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\5\u00be\u078f\n\u00be\3\u00bf\3\u00bf\5\u00bf\u0793\n"+
		"\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf"+
		"\u079c\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u07a8\n\u00c1\3\u00c2\3\u00c2\5\u00c2"+
		"\u07ac\n\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c3\7\u00c3\u07b3\n"+
		"\u00c3\f\u00c3\16\u00c3\u07b6\13\u00c3\3\u00c3\5\u00c3\u07b9\n\u00c3\3"+
		"\u00c4\3\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u07c2\n"+
		"\u00c5\3\u00c6\3\u00c6\3\u00c6\7\u00c6\u07c7\n\u00c6\f\u00c6\16\u00c6"+
		"\u07ca\13\u00c6\3\u00c6\5\u00c6\u07cd\n\u00c6\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9"+
		"\u07e3\n\u00c9\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u07e8\n\u00ca\3\u00cb\3"+
		"\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00ce\3\u00ce\5\u00ce\u07f9\n\u00ce\3\u00cf"+
		"\3\u00cf\5\u00cf\u07fd\n\u00cf\3\u00cf\5\u00cf\u0800\n\u00cf\3\u00cf\3"+
		"\u00cf\3\u00d0\3\u00d0\5\u00d0\u0806\n\u00d0\3\u00d0\3\u00d0\3\u00d0\3"+
		"\u00d0\5\u00d0\u080c\n\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\5"+
		"\u00d0\u0813\n\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u081a"+
		"\n\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u0821\n\u00d0"+
		"\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d2\7\u00d2\u082a"+
		"\n\u00d2\f\u00d2\16\u00d2\u082d\13\u00d2\3\u00d3\5\u00d3\u0830\n\u00d3"+
		"\3\u00d3\3\u00d3\3\u00d4\3\u00d4\3\u00d5\3\u00d5\5\u00d5\u0838\n\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d6\3\u00d6\3\u00d6\7\u00d6\u083f\n\u00d6\f\u00d6"+
		"\16\u00d6\u0842\13\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\5\u00d7"+
		"\u0849\n\u00d7\3\u00d8\3\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\7\u00da\u0857\n\u00da\f\u00da"+
		"\16\u00da\u085a\13\u00da\3\u00db\5\u00db\u085d\n\u00db\3\u00db\5\u00db"+
		"\u0860\n\u00db\3\u00db\3\u00db\5\u00db\u0864\n\u00db\3\u00db\3\u00db\5"+
		"\u00db\u0868\n\u00db\3\u00db\3\u00db\3\u00db\5\u00db\u086d\n\u00db\3\u00db"+
		"\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\5\u00db\u0876\n\u00db"+
		"\3\u00db\3\u00db\3\u00db\5\u00db\u087b\n\u00db\3\u00db\5\u00db\u087e\n"+
		"\u00db\3\u00db\3\u00db\3\u00db\5\u00db\u0883\n\u00db\3\u00db\3\u00db\3"+
		"\u00db\5\u00db\u0888\n\u00db\3\u00db\3\u00db\3\u00db\5\u00db\u088d\n\u00db"+
		"\3\u00db\3\u00db\3\u00db\5\u00db\u0892\n\u00db\3\u00db\3\u00db\3\u00db"+
		"\3\u00db\3\u00db\5\u00db\u0899\n\u00db\3\u00dc\3\u00dc\5\u00dc\u089d\n"+
		"\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00de\3\u00de\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\5\u00df\u08aa\n\u00df\3\u00df\3\u00df\5\u00df"+
		"\u08ae\n\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\7\u00df\u08c2\n\u00df\f\u00df\16\u00df\u08c5\13\u00df"+
		"\3\u00e0\3\u00e0\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\3\u00e2\3\u00e2\3\u00e3\3\u00e3\5\u00e3\u08d5\n\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e4\3\u00e4\5\u00e4\u08db\n\u00e4\3\u00e4\3\u00e4\5\u00e4"+
		"\u08df\n\u00e4\3\u00e4\3\u00e4\3\u00e4\5\u00e4\u08e4\n\u00e4\3\u00e5\3"+
		"\u00e5\3\u00e6\3\u00e6\5\u00e6\u08ea\n\u00e6\3\u00e6\3\u00e6\3\u00e7\3"+
		"\u00e7\5\u00e7\u08f0\n\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\5"+
		"\u00e8\u08f7\n\u00e8\3\u00e9\5\u00e9\u08fa\n\u00e9\3\u00e9\5\u00e9\u08fd"+
		"\n\u00e9\3\u00e9\3\u00e9\5\u00e9\u0901\n\u00e9\3\u00e9\3\u00e9\3\u00e9"+
		"\5\u00e9\u0906\n\u00e9\3\u00ea\3\u00ea\3\u00eb\3\u00eb\3\u00eb\5\u00eb"+
		"\u090d\n\u00eb\3\u00eb\3\u00eb\3\u00ec\3\u00ec\3\u00ec\6\u00ec\u0914\n"+
		"\u00ec\r\u00ec\16\u00ec\u0915\5\u00ec\u0918\n\u00ec\3\u00ed\3\u00ed\3"+
		"\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee"+
		"\5\u00ee\u0925\n\u00ee\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\5\u00ef"+
		"\u092c\n\u00ef\3\u00f0\3\u00f0\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1"+
		"\3\u00f1\5\u00f1\u0936\n\u00f1\3\u00f2\3\u00f2\3\u00f2\7\u00f2\u093b\n"+
		"\u00f2\f\u00f2\16\u00f2\u093e\13\u00f2\3\u00f3\3\u00f3\3\u00f4\3\u00f4"+
		"\3\u00f4\3\u00f5\3\u00f5\3\u00f5\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f7"+
		"\3\u00f7\3\u00f7\3\u00f7\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f9\3\u00f9"+
		"\3\u00f9\3\u00f9\3\u00f9\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fb\3\u00fb"+
		"\3\u00fb\3\u00fc\3\u00fc\3\u00fc\3\u00fd\3\u00fd\3\u00fd\3\u00fe\3\u00fe"+
		"\3\u00fe\7\u00fe\u0969\n\u00fe\f\u00fe\16\u00fe\u096c\13\u00fe\3\u00fe"+
		"\3\u00fe\3\u00fe\7\u00fe\u0971\n\u00fe\f\u00fe\16\u00fe\u0974\13\u00fe"+
		"\5\u00fe\u0976\n\u00fe\3\u00ff\3\u00ff\5\u00ff\u097a\n\u00ff\3\u0100\3"+
		"\u0100\5\u0100\u097e\n\u0100\3\u0101\3\u0101\3\u0101\3\u0102\3\u0102\5"+
		"\u0102\u0985\n\u0102\3\u0103\3\u0103\3\u0103\3\u0103\5\u0103\u098b\n\u0103"+
		"\3\u0104\5\u0104\u098e\n\u0104\3\u0104\3\u0104\5\u0104\u0992\n\u0104\3"+
		"\u0104\5\u0104\u0995\n\u0104\3\u0105\3\u0105\3\u0106\3\u0106\3\u0107\3"+
		"\u0107\3\u0108\3\u0108\3\u0108\2\6f\u014a\u01b2\u01bc\u0109\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120"+
		"\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138"+
		"\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150"+
		"\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168"+
		"\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180"+
		"\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198"+
		"\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0"+
		"\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8"+
		"\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0"+
		"\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8"+
		"\u01fa\u01fc\u01fe\u0200\u0202\u0204\u0206\u0208\u020a\u020c\u020e\2\r"+
		"\4\2ii\u0081\u0081\3\2\37\"\3\2#&\4\2\b\b).\3\2BD\5\2OORR_`\b\2/\62\66"+
		"\66<MOORRcd\5\2uvxy{\u0084\3\2fg\3\2\u0088\u008c\3\2\u008e\u008f\u0a3c"+
		"\2\u0213\3\2\2\2\4\u0239\3\2\2\2\6\u023c\3\2\2\2\b\u0240\3\2\2\2\n\u0246"+
		"\3\2\2\2\f\u0264\3\2\2\2\16\u0268\3\2\2\2\20\u026a\3\2\2\2\22\u0276\3"+
		"\2\2\2\24\u0284\3\2\2\2\26\u0286\3\2\2\2\30\u0291\3\2\2\2\32\u0293\3\2"+
		"\2\2\34\u0299\3\2\2\2\36\u02a8\3\2\2\2 \u02aa\3\2\2\2\"\u02b3\3\2\2\2"+
		"$\u02bb\3\2\2\2&\u02bd\3\2\2\2(\u02c7\3\2\2\2*\u02c9\3\2\2\2,\u02ce\3"+
		"\2\2\2.\u02d6\3\2\2\2\60\u02e0\3\2\2\2\62\u02e2\3\2\2\2\64\u02f1\3\2\2"+
		"\2\66\u02f3\3\2\2\28\u02f6\3\2\2\2:\u02f9\3\2\2\2<\u0304\3\2\2\2>\u0306"+
		"\3\2\2\2@\u0309\3\2\2\2B\u0310\3\2\2\2D\u0312\3\2\2\2F\u0316\3\2\2\2H"+
		"\u031a\3\2\2\2J\u031c\3\2\2\2L\u0320\3\2\2\2N\u0325\3\2\2\2P\u032d\3\2"+
		"\2\2R\u032f\3\2\2\2T\u0332\3\2\2\2V\u0335\3\2\2\2X\u033a\3\2\2\2Z\u033e"+
		"\3\2\2\2\\\u0349\3\2\2\2^\u034b\3\2\2\2`\u0358\3\2\2\2b\u035c\3\2\2\2"+
		"d\u0361\3\2\2\2f\u036f\3\2\2\2h\u0388\3\2\2\2j\u038a\3\2\2\2l\u038c\3"+
		"\2\2\2n\u0393\3\2\2\2p\u0395\3\2\2\2r\u0397\3\2\2\2t\u0399\3\2\2\2v\u03a0"+
		"\3\2\2\2x\u03b1\3\2\2\2z\u03b3\3\2\2\2|\u03bb\3\2\2\2~\u03bf\3\2\2\2\u0080"+
		"\u03c9\3\2\2\2\u0082\u03cb\3\2\2\2\u0084\u03cf\3\2\2\2\u0086\u03d3\3\2"+
		"\2\2\u0088\u03db\3\2\2\2\u008a\u03eb\3\2\2\2\u008c\u03ee\3\2\2\2\u008e"+
		"\u03f3\3\2\2\2\u0090\u03f5\3\2\2\2\u0092\u03fc\3\2\2\2\u0094\u0404\3\2"+
		"\2\2\u0096\u040b\3\2\2\2\u0098\u040f\3\2\2\2\u009a\u0412\3\2\2\2\u009c"+
		"\u041a\3\2\2\2\u009e\u0422\3\2\2\2\u00a0\u0426\3\2\2\2\u00a2\u044c\3\2"+
		"\2\2\u00a4\u044f\3\2\2\2\u00a6\u0456\3\2\2\2\u00a8\u0464\3\2\2\2\u00aa"+
		"\u0467\3\2\2\2\u00ac\u046d\3\2\2\2\u00ae\u0475\3\2\2\2\u00b0\u0485\3\2"+
		"\2\2\u00b2\u0488\3\2\2\2\u00b4\u048d\3\2\2\2\u00b6\u049d\3\2\2\2\u00b8"+
		"\u04a0\3\2\2\2\u00ba\u04a9\3\2\2\2\u00bc\u04b1\3\2\2\2\u00be\u04b5\3\2"+
		"\2\2\u00c0\u04bd\3\2\2\2\u00c2\u04bf\3\2\2\2\u00c4\u04c2\3\2\2\2\u00c6"+
		"\u04cc\3\2\2\2\u00c8\u04d5\3\2\2\2\u00ca\u04e3\3\2\2\2\u00cc\u04e5\3\2"+
		"\2\2\u00ce\u04eb\3\2\2\2\u00d0\u04ed\3\2\2\2\u00d2\u04f7\3\2\2\2\u00d4"+
		"\u04f9\3\2\2\2\u00d6\u0527\3\2\2\2\u00d8\u052b\3\2\2\2\u00da\u052f\3\2"+
		"\2\2\u00dc\u0531\3\2\2\2\u00de\u0542\3\2\2\2\u00e0\u0545\3\2\2\2\u00e2"+
		"\u0555\3\2\2\2\u00e4\u055b\3\2\2\2\u00e6\u055e\3\2\2\2\u00e8\u056b\3\2"+
		"\2\2\u00ea\u056d\3\2\2\2\u00ec\u0571\3\2\2\2\u00ee\u0573\3\2\2\2\u00f0"+
		"\u0575\3\2\2\2\u00f2\u057f\3\2\2\2\u00f4\u0585\3\2\2\2\u00f6\u0588\3\2"+
		"\2\2\u00f8\u0592\3\2\2\2\u00fa\u0594\3\2\2\2\u00fc\u0598\3\2\2\2\u00fe"+
		"\u059e\3\2\2\2\u0100\u05a1\3\2\2\2\u0102\u05b0\3\2\2\2\u0104\u05b2\3\2"+
		"\2\2\u0106\u05b9\3\2\2\2\u0108\u05c8\3\2\2\2\u010a\u05ca\3\2\2\2\u010c"+
		"\u05d1\3\2\2\2\u010e\u05dd\3\2\2\2\u0110\u05df\3\2\2\2\u0112\u05ea\3\2"+
		"\2\2\u0114\u05ec\3\2\2\2\u0116\u05f0\3\2\2\2\u0118\u05f5\3\2\2\2\u011a"+
		"\u060b\3\2\2\2\u011c\u060d\3\2\2\2\u011e\u0612\3\2\2\2\u0120\u0631\3\2"+
		"\2\2\u0122\u064a\3\2\2\2\u0124\u064c\3\2\2\2\u0126\u064f\3\2\2\2\u0128"+
		"\u0655\3\2\2\2\u012a\u065e\3\2\2\2\u012c\u0670\3\2\2\2\u012e\u0673\3\2"+
		"\2\2\u0130\u067b\3\2\2\2\u0132\u0684\3\2\2\2\u0134\u0686\3\2\2\2\u0136"+
		"\u068c\3\2\2\2\u0138\u0692\3\2\2\2\u013a\u069a\3\2\2\2\u013c\u069f\3\2"+
		"\2\2\u013e\u06a2\3\2\2\2\u0140\u06a4\3\2\2\2\u0142\u06a7\3\2\2\2\u0144"+
		"\u06c2\3\2\2\2\u0146\u06c4\3\2\2\2\u0148\u06d7\3\2\2\2\u014a\u06ec\3\2"+
		"\2\2\u014c\u06f6\3\2\2\2\u014e\u06f8\3\2\2\2\u0150\u06fe\3\2\2\2\u0152"+
		"\u0700\3\2\2\2\u0154\u0706\3\2\2\2\u0156\u070e\3\2\2\2\u0158\u0711\3\2"+
		"\2\2\u015a\u0718\3\2\2\2\u015c\u071b\3\2\2\2\u015e\u071e\3\2\2\2\u0160"+
		"\u0724\3\2\2\2\u0162\u0726\3\2\2\2\u0164\u072d\3\2\2\2\u0166\u0732\3\2"+
		"\2\2\u0168\u074a\3\2\2\2\u016a\u074d\3\2\2\2\u016c\u0753\3\2\2\2\u016e"+
		"\u0760\3\2\2\2\u0170\u0762\3\2\2\2\u0172\u076a\3\2\2\2\u0174\u0776\3\2"+
		"\2\2\u0176\u0779\3\2\2\2\u0178\u077d\3\2\2\2\u017a\u078e\3\2\2\2\u017c"+
		"\u079b\3\2\2\2\u017e\u079d\3\2\2\2\u0180\u07a7\3\2\2\2\u0182\u07a9\3\2"+
		"\2\2\u0184\u07af\3\2\2\2\u0186\u07ba\3\2\2\2\u0188\u07c1\3\2\2\2\u018a"+
		"\u07c3\3\2\2\2\u018c\u07ce\3\2\2\2\u018e\u07d2\3\2\2\2\u0190\u07e2\3\2"+
		"\2\2\u0192\u07e7\3\2\2\2\u0194\u07e9\3\2\2\2\u0196\u07ed\3\2\2\2\u0198"+
		"\u07f2\3\2\2\2\u019a\u07f8\3\2\2\2\u019c\u07fa\3\2\2\2\u019e\u0820\3\2"+
		"\2\2\u01a0\u0822\3\2\2\2\u01a2\u0826\3\2\2\2\u01a4\u082f\3\2\2\2\u01a6"+
		"\u0833\3\2\2\2\u01a8\u0835\3\2\2\2\u01aa\u083b\3\2\2\2\u01ac\u0848\3\2"+
		"\2\2\u01ae\u084a\3\2\2\2\u01b0\u084c\3\2\2\2\u01b2\u0851\3\2\2\2\u01b4"+
		"\u0898\3\2\2\2\u01b6\u089a\3\2\2\2\u01b8\u089e\3\2\2\2\u01ba\u08a1\3\2"+
		"\2\2\u01bc\u08a9\3\2\2\2\u01be\u08c6\3\2\2\2\u01c0\u08c8\3\2\2\2\u01c2"+
		"\u08cc\3\2\2\2\u01c4\u08d2\3\2\2\2\u01c6\u08e3\3\2\2\2\u01c8\u08e5\3\2"+
		"\2\2\u01ca\u08e7\3\2\2\2\u01cc\u08ed\3\2\2\2\u01ce\u08f6\3\2\2\2\u01d0"+
		"\u0905\3\2\2\2\u01d2\u0907\3\2\2\2\u01d4\u0909\3\2\2\2\u01d6\u0917\3\2"+
		"\2\2\u01d8\u0919\3\2\2\2\u01da\u0924\3\2\2\2\u01dc\u092b\3\2\2\2\u01de"+
		"\u092d\3\2\2\2\u01e0\u0935\3\2\2\2\u01e2\u0937\3\2\2\2\u01e4\u093f\3\2"+
		"\2\2\u01e6\u0941\3\2\2\2\u01e8\u0944\3\2\2\2\u01ea\u0947\3\2\2\2\u01ec"+
		"\u094b\3\2\2\2\u01ee\u094f\3\2\2\2\u01f0\u0953\3\2\2\2\u01f2\u0958\3\2"+
		"\2\2\u01f4\u095c\3\2\2\2\u01f6\u095f\3\2\2\2\u01f8\u0962\3\2\2\2\u01fa"+
		"\u0975\3\2\2\2\u01fc\u0979\3\2\2\2\u01fe\u097d\3\2\2\2\u0200\u097f\3\2"+
		"\2\2\u0202\u0984\3\2\2\2\u0204\u098a\3\2\2\2\u0206\u0994\3\2\2\2\u0208"+
		"\u0996\3\2\2\2\u020a\u0998\3\2\2\2\u020c\u099a\3\2\2\2\u020e\u099c\3\2"+
		"\2\2\u0210\u0212\5\4\3\2\u0211\u0210\3\2\2\2\u0212\u0215\3\2\2\2\u0213"+
		"\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216\3\2\2\2\u0215\u0213\3\2"+
		"\2\2\u0216\u0217\7\2\2\3\u0217\3\3\2\2\2\u0218\u021a\5\u016a\u00b6\2\u0219"+
		"\u021b\5\b\5\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u023a\3\2"+
		"\2\2\u021c\u021e\5\u008aF\2\u021d\u021f\5\b\5\2\u021e\u021d\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f\u023a\3\2\2\2\u0220\u0222\5\n\6\2\u0221\u0223\5\b"+
		"\5\2\u0222\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u023a\3\2\2\2\u0224"+
		"\u0226\5$\23\2\u0225\u0227\5\b\5\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2"+
		"\2\2\u0227\u023a\3\2\2\2\u0228\u022a\5<\37\2\u0229\u022b\5\b\5\2\u022a"+
		"\u0229\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u023a\3\2\2\2\u022c\u022e\5B"+
		"\"\2\u022d\u022f\5\b\5\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"\u023a\3\2\2\2\u0230\u0232\5T+\2\u0231\u0233\5\b\5\2\u0232\u0231\3\2\2"+
		"\2\u0232\u0233\3\2\2\2\u0233\u023a\3\2\2\2\u0234\u0236\5V,\2\u0235\u0237"+
		"\5\b\5\2\u0236\u0235\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u023a\3\2\2\2\u0238"+
		"\u023a\5\\/\2\u0239\u0218\3\2\2\2\u0239\u021c\3\2\2\2\u0239\u0220\3\2"+
		"\2\2\u0239\u0224\3\2\2\2\u0239\u0228\3\2\2\2\u0239\u022c\3\2\2\2\u0239"+
		"\u0230\3\2\2\2\u0239\u0234\3\2\2\2\u0239\u0238\3\2\2\2\u023a\5\3\2\2\2"+
		"\u023b\u023d\5\4\3\2\u023c\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023c"+
		"\3\2\2\2\u023e\u023f\3\2\2\2\u023f\7\3\2\2\2\u0240\u0241\7t\2\2\u0241"+
		"\t\3\2\2\2\u0242\u0247\5\f\7\2\u0243\u0247\5\20\t\2\u0244\u0247\5\22\n"+
		"\2\u0245\u0247\5\"\22\2\u0246\u0242\3\2\2\2\u0246\u0243\3\2\2\2\u0246"+
		"\u0244\3\2\2\2\u0246\u0245\3\2\2\2\u0247\13\3\2\2\2\u0248\u024a\7\3\2"+
		"\2\u0249\u024b\5\16\b\2\u024a\u0249\3\2\2\2\u024a\u024b\3\2\2\2\u024b"+
		"\u024c\3\2\2\2\u024c\u024e\7t\2\2\u024d\u024f\5\u016a\u00b6\2\u024e\u024d"+
		"\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0252\7t\2\2\u0251"+
		"\u0253\5\u016a\u00b6\2\u0252\u0251\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254"+
		"\3\2\2\2\u0254\u0265\5\u0090I\2\u0255\u0256\7\3\2\2\u0256\u0258\7m\2\2"+
		"\u0257\u0259\5\16\b\2\u0258\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a"+
		"\3\2\2\2\u025a\u025c\7t\2\2\u025b\u025d\5\u016a\u00b6\2\u025c\u025b\3"+
		"\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0260\7t\2\2\u025f"+
		"\u0261\5\u016a\u00b6\2\u0260\u025f\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262"+
		"\3\2\2\2\u0262\u0263\7p\2\2\u0263\u0265\5\u0090I\2\u0264\u0248\3\2\2\2"+
		"\u0264\u0255\3\2\2\2\u0265\r\3\2\2\2\u0266\u0269\5\u00a2R\2\u0267\u0269"+
		"\5\u016c\u00b7\2\u0268\u0266\3\2\2\2\u0268\u0267\3\2\2\2\u0269\17\3\2"+
		"\2\2\u026a\u026c\7\3\2\2\u026b\u026d\7\4\2\2\u026c\u026b\3\2\2\2\u026c"+
		"\u026d\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026f\5\u014a\u00a6\2\u026f\u0270"+
		"\7\5\2\2\u0270\u0272\5\u016a\u00b6\2\u0271\u0273\58\35\2\u0272\u0271\3"+
		"\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\5\u0090I\2"+
		"\u0275\21\3\2\2\2\u0276\u0277\7\6\2\2\u0277\u0278\5\24\13\2\u0278\u0279"+
		"\5\u0090I\2\u0279\23\3\2\2\2\u027a\u0285\5\u016a\u00b6\2\u027b\u027c\5"+
		"\u016a\u00b6\2\u027c\u027d\7r\2\2\u027d\u027e\5\26\f\2\u027e\u0285\3\2"+
		"\2\2\u027f\u0285\5\26\f\2\u0280\u0281\5L\'\2\u0281\u0282\7r\2\2\u0282"+
		"\u0283\5\u016a\u00b6\2\u0283\u0285\3\2\2\2\u0284\u027a\3\2\2\2\u0284\u027b"+
		"\3\2\2\2\u0284\u027f\3\2\2\2\u0284\u0280\3\2\2\2\u0285\25\3\2\2\2\u0286"+
		"\u028b\5\30\r\2\u0287\u0288\7r\2\2\u0288\u028a\5\30\r\2\u0289\u0287\3"+
		"\2\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c"+
		"\27\3\2\2\2\u028d\u028b\3\2\2\2\u028e\u0292\5L\'\2\u028f\u0292\5\32\16"+
		"\2\u0290\u0292\5\34\17\2\u0291\u028e\3\2\2\2\u0291\u028f\3\2\2\2\u0291"+
		"\u0290\3\2\2\2\u0292\31\3\2\2\2\u0293\u0294\7\4\2\2\u0294\u0295\5\u014a"+
		"\u00a6\2\u0295\u0297\5\u00a0Q\2\u0296\u0298\58\35\2\u0297\u0296\3\2\2"+
		"\2\u0297\u0298\3\2\2\2\u0298\33\3\2\2\2\u0299\u029b\5\36\20\2\u029a\u029c"+
		"\5 \21\2\u029b\u029a\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029e\3\2\2\2\u029d"+
		"\u029f\58\35\2\u029e\u029d\3\2\2\2\u029e\u029f\3\2\2\2\u029f\35\3\2\2"+
		"\2\u02a0\u02a1\7\7\2\2\u02a1\u02a2\5\u014a\u00a6\2\u02a2\u02a3\5\u00a0"+
		"Q\2\u02a3\u02a9\3\2\2\2\u02a4\u02a5\7\b\2\2\u02a5\u02a6\5\u014a\u00a6"+
		"\2\u02a6\u02a7\5\u00a0Q\2\u02a7\u02a9\3\2\2\2\u02a8\u02a0\3\2\2\2\u02a8"+
		"\u02a4\3\2\2\2\u02a9\37\3\2\2\2\u02aa\u02ab\7r\2\2\u02ab\u02b0\5\36\20"+
		"\2\u02ac\u02ad\7r\2\2\u02ad\u02af\5\36\20\2\u02ae\u02ac\3\2\2\2\u02af"+
		"\u02b2\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1!\3\2\2\2"+
		"\u02b2\u02b0\3\2\2\2\u02b3\u02b4\7\t\2\2\u02b4\u02b5\5\u0090I\2\u02b5"+
		"\u02b6\7\6\2\2\u02b6\u02b7\5\u016a\u00b6\2\u02b7#\3\2\2\2\u02b8\u02bc"+
		"\5&\24\2\u02b9\u02bc\5*\26\2\u02ba\u02bc\5,\27\2\u02bb\u02b8\3\2\2\2\u02bb"+
		"\u02b9\3\2\2\2\u02bb\u02ba\3\2\2\2\u02bc%\3\2\2\2\u02bd\u02be\7\n\2\2"+
		"\u02be\u02bf\5\24\13\2\u02bf\u02c1\5\u0090I\2\u02c0\u02c2\5(\25\2\u02c1"+
		"\u02c0\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\'\3\2\2\2\u02c3\u02c4\7\13\2"+
		"\2\u02c4\u02c8\5\u0090I\2\u02c5\u02c6\7\13\2\2\u02c6\u02c8\5&\24\2\u02c7"+
		"\u02c3\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8)\3\2\2\2\u02c9\u02ca\7\f\2\2"+
		"\u02ca\u02cb\5\24\13\2\u02cb\u02cc\7\13\2\2\u02cc\u02cd\5\u0090I\2\u02cd"+
		"+\3\2\2\2\u02ce\u02cf\7\r\2\2\u02cf\u02d0\5\u016a\u00b6\2\u02d0\u02d2"+
		"\7l\2\2\u02d1\u02d3\5.\30\2\u02d2\u02d1\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3"+
		"\u02d4\3\2\2\2\u02d4\u02d5\7o\2\2\u02d5-\3\2\2\2\u02d6\u02d8\5\60\31\2"+
		"\u02d7\u02d9\5.\30\2\u02d8\u02d7\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9/\3"+
		"\2\2\2\u02da\u02db\5\62\32\2\u02db\u02dc\5\6\4\2\u02dc\u02e1\3\2\2\2\u02dd"+
		"\u02de\5\66\34\2\u02de\u02df\5\6\4\2\u02df\u02e1\3\2\2\2\u02e0\u02da\3"+
		"\2\2\2\u02e0\u02dd\3\2\2\2\u02e1\61\3\2\2\2\u02e2\u02e3\7\4\2\2\u02e3"+
		"\u02e4\5\64\33\2\u02e4\u02e5\7s\2\2\u02e5\63\3\2\2\2\u02e6\u02e8\5\u014a"+
		"\u00a6\2\u02e7\u02e9\58\35\2\u02e8\u02e7\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9"+
		"\u02f2\3\2\2\2\u02ea\u02ec\5\u014a\u00a6\2\u02eb\u02ed\58\35\2\u02ec\u02eb"+
		"\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\7r\2\2\u02ef"+
		"\u02f0\5\64\33\2\u02f0\u02f2\3\2\2\2\u02f1\u02e6\3\2\2\2\u02f1\u02ea\3"+
		"\2\2\2\u02f2\65\3\2\2\2\u02f3\u02f4\7\16\2\2\u02f4\u02f5\7s\2\2\u02f5"+
		"\67\3\2\2\2\u02f6\u02f7\7\17\2\2\u02f7\u02f8\5:\36\2\u02f89\3\2\2\2\u02f9"+
		"\u02fa\5\u016a\u00b6\2\u02fa;\3\2\2\2\u02fb\u02fc\5> \2\u02fc\u02fd\5"+
		"\n\6\2\u02fd\u0305\3\2\2\2\u02fe\u02ff\5> \2\u02ff\u0300\5&\24\2\u0300"+
		"\u0305\3\2\2\2\u0301\u0302\5> \2\u0302\u0303\5,\27\2\u0303\u0305\3\2\2"+
		"\2\u0304\u02fb\3\2\2\2\u0304\u02fe\3\2\2\2\u0304\u0301\3\2\2\2\u0305="+
		"\3\2\2\2\u0306\u0307\5@!\2\u0307\u0308\7s\2\2\u0308?\3\2\2\2\u0309\u030a"+
		"\5\u01e0\u00f1\2\u030aA\3\2\2\2\u030b\u0311\5D#\2\u030c\u0311\5F$\2\u030d"+
		"\u0311\5H%\2\u030e\u0311\5J&\2\u030f\u0311\5R*\2\u0310\u030b\3\2\2\2\u0310"+
		"\u030c\3\2\2\2\u0310\u030d\3\2\2\2\u0310\u030e\3\2\2\2\u0310\u030f\3\2"+
		"\2\2\u0311C\3\2\2\2\u0312\u0314\7\20\2\2\u0313\u0315\5@!\2\u0314\u0313"+
		"\3\2\2\2\u0314\u0315\3\2\2\2\u0315E\3\2\2\2\u0316\u0318\7\21\2\2\u0317"+
		"\u0319\5@!\2\u0318\u0317\3\2\2\2\u0318\u0319\3\2\2\2\u0319G\3\2\2\2\u031a"+
		"\u031b\7\22\2\2\u031bI\3\2\2\2\u031c\u031e\7\23\2\2\u031d\u031f\5\u016a"+
		"\u00b6\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031fK\3\2\2\2\u0320"+
		"\u0321\7\24\2\2\u0321\u0322\7m\2\2\u0322\u0323\5N(\2\u0323\u0324\7p\2"+
		"\2\u0324M\3\2\2\2\u0325\u032a\5P)\2\u0326\u0327\7r\2\2\u0327\u0329\5P"+
		")\2\u0328\u0326\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328\3\2\2\2\u032a"+
		"\u032b\3\2\2\2\u032bO\3\2\2\2\u032c\u032a\3\2\2\2\u032d\u032e\t\2\2\2"+
		"\u032eQ\3\2\2\2\u032f\u0330\7\25\2\2\u0330\u0331\5\u016a\u00b6\2\u0331"+
		"S\3\2\2\2\u0332\u0333\7\26\2\2\u0333\u0334\5\u0090I\2\u0334U\3\2\2\2\u0335"+
		"\u0336\7\27\2\2\u0336\u0338\5\u0090I\2\u0337\u0339\5X-\2\u0338\u0337\3"+
		"\2\2\2\u0338\u0339\3\2\2\2\u0339W\3\2\2\2\u033a\u033c\5Z.\2\u033b\u033d"+
		"\5X-\2\u033c\u033b\3\2\2\2\u033c\u033d\3\2\2\2\u033dY\3\2\2\2\u033e\u0340"+
		"\7\30\2\2\u033f\u0341\5\u014a\u00a6\2\u0340\u033f\3\2\2\2\u0340\u0341"+
		"\3\2\2\2\u0341\u0343\3\2\2\2\u0342\u0344\58\35\2\u0343\u0342\3\2\2\2\u0343"+
		"\u0344\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346\5\u0090I\2\u0346[\3\2\2"+
		"\2\u0347\u034a\5^\60\2\u0348\u034a\5n8\2\u0349\u0347\3\2\2\2\u0349\u0348"+
		"\3\2\2\2\u034a]\3\2\2\2\u034b\u034c\7\31\2\2\u034c\u034e\5f\64\2\u034d"+
		"\u034f\5\6\4\2\u034e\u034d\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0351\3\2"+
		"\2\2\u0350\u0352\5`\61\2\u0351\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352"+
		"\u0354\3\2\2\2\u0353\u0355\5d\63\2\u0354\u0353\3\2\2\2\u0354\u0355\3\2"+
		"\2\2\u0355\u0356\3\2\2\2\u0356\u0357\7\32\2\2\u0357_\3\2\2\2\u0358\u035a"+
		"\5b\62\2\u0359\u035b\5`\61\2\u035a\u0359\3\2\2\2\u035a\u035b\3\2\2\2\u035b"+
		"a\3\2\2\2\u035c\u035d\7\33\2\2\u035d\u035f\5f\64\2\u035e\u0360\5\6\4\2"+
		"\u035f\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360c\3\2\2\2\u0361\u0363\7"+
		"\34\2\2\u0362\u0364\5\6\4\2\u0363\u0362\3\2\2\2\u0363\u0364\3\2\2\2\u0364"+
		"e\3\2\2\2\u0365\u0366\b\64\1\2\u0366\u0367\7x\2\2\u0367\u0370\5f\64\5"+
		"\u0368\u0370\5h\65\2\u0369\u0370\5\u01e0\u00f1\2\u036a\u0370\5\u0208\u0105"+
		"\2\u036b\u036c\7m\2\2\u036c\u036d\5f\64\2\u036d\u036e\7p\2\2\u036e\u0370"+
		"\3\2\2\2\u036f\u0365\3\2\2\2\u036f\u0368\3\2\2\2\u036f\u0369\3\2\2\2\u036f"+
		"\u036a\3\2\2\2\u036f\u036b\3\2\2\2\u0370\u037b\3\2\2\2\u0371\u0372\f\4"+
		"\2\2\u0372\u0373\5\u01ea\u00f6\2\u0373\u0374\5f\64\5\u0374\u037a\3\2\2"+
		"\2\u0375\u0376\f\3\2\2\u0376\u0377\5\u01ec\u00f7\2\u0377\u0378\5f\64\4"+
		"\u0378\u037a\3\2\2\2\u0379\u0371\3\2\2\2\u0379\u0375\3\2\2\2\u037a\u037d"+
		"\3\2\2\2\u037b\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037cg\3\2\2\2\u037d"+
		"\u037b\3\2\2\2\u037e\u037f\7\35\2\2\u037f\u0380\7m\2\2\u0380\u0381\5j"+
		"\66\2\u0381\u0382\7p\2\2\u0382\u0389\3\2\2\2\u0383\u0384\7\36\2\2\u0384"+
		"\u0385\7m\2\2\u0385\u0386\5l\67\2\u0386\u0387\7p\2\2\u0387\u0389\3\2\2"+
		"\2\u0388\u037e\3\2\2\2\u0388\u0383\3\2\2\2\u0389i\3\2\2\2\u038a\u038b"+
		"\t\3\2\2\u038bk\3\2\2\2\u038c\u038d\t\4\2\2\u038dm\3\2\2\2\u038e\u0394"+
		"\7\'\2\2\u038f\u0390\7\'\2\2\u0390\u0391\5p9\2\u0391\u0392\5r:\2\u0392"+
		"\u0394\3\2\2\2\u0393\u038e\3\2\2\2\u0393\u038f\3\2\2\2\u0394o\3\2\2\2"+
		"\u0395\u0396\5\u020c\u0107\2\u0396q\3\2\2\2\u0397\u0398\7\u008e\2\2\u0398"+
		"s\3\2\2\2\u0399\u039a\7u\2\2\u039a\u039c\5v<\2\u039b\u039d\5z>\2\u039c"+
		"\u039b\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u039f\7v"+
		"\2\2\u039fu\3\2\2\2\u03a0\u03a5\5x=\2\u03a1\u03a2\7r\2\2\u03a2\u03a4\5"+
		"x=\2\u03a3\u03a1\3\2\2\2\u03a4\u03a7\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a5"+
		"\u03a6\3\2\2\2\u03a6w\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a8\u03b2\5\u01c8"+
		"\u00e5\2\u03a9\u03aa\5\u01c8\u00e5\2\u03aa\u03ab\7s\2\2\u03ab\u03ac\5"+
		"\u01c6\u00e4\2\u03ac\u03b2\3\2\2\2\u03ad\u03ae\5\u01c8\u00e5\2\u03ae\u03af"+
		"\7s\2\2\u03af\u03b0\5\u01d4\u00eb\2\u03b0\u03b2\3\2\2\2\u03b1\u03a8\3"+
		"\2\2\2\u03b1\u03a9\3\2\2\2\u03b1\u03ad\3\2\2\2\u03b2y\3\2\2\2\u03b3\u03b4"+
		"\7\17\2\2\u03b4\u03b5\5|?\2\u03b5{\3\2\2\2\u03b6\u03bc\5~@\2\u03b7\u03b8"+
		"\5~@\2\u03b8\u03b9\7r\2\2\u03b9\u03ba\5|?\2\u03ba\u03bc\3\2\2\2\u03bb"+
		"\u03b6\3\2\2\2\u03bb\u03b7\3\2\2\2\u03bc}\3\2\2\2\u03bd\u03c0\5\u0080"+
		"A\2\u03be\u03c0\5\u0082B\2\u03bf\u03bd\3\2\2\2\u03bf\u03be\3\2\2\2\u03c0"+
		"\177\3\2\2\2\u03c1\u03c2\5\u01c6\u00e4\2\u03c2\u03c3\7s\2\2\u03c3\u03c4"+
		"\5\u01c6\u00e4\2\u03c4\u03ca\3\2\2\2\u03c5\u03c6\5\u01c6\u00e4\2\u03c6"+
		"\u03c7\7s\2\2\u03c7\u03c8\5\u01d4\u00eb\2\u03c8\u03ca\3\2\2\2\u03c9\u03c1"+
		"\3\2\2\2\u03c9\u03c5\3\2\2\2\u03ca\u0081\3\2\2\2\u03cb\u03cc\5\u01c6\u00e4"+
		"\2\u03cc\u03cd\5\u01f2\u00fa\2\u03cd\u03ce\5\u01bc\u00df\2\u03ce\u0083"+
		"\3\2\2\2\u03cf\u03d0\7u\2\2\u03d0\u03d1\5\u0086D\2\u03d1\u03d2\7v\2\2"+
		"\u03d2\u0085\3\2\2\2\u03d3\u03d8\5\u0088E\2\u03d4\u03d5\7r\2\2\u03d5\u03d7"+
		"\5\u0088E\2\u03d6\u03d4\3\2\2\2\u03d7\u03da\3\2\2\2\u03d8\u03d6\3\2\2"+
		"\2\u03d8\u03d9\3\2\2\2\u03d9\u0087\3\2\2\2\u03da\u03d8\3\2\2\2\u03db\u03dc"+
		"\5\u01bc\u00df\2\u03dc\u0089\3\2\2\2\u03dd\u03ec\5\u0092J\2\u03de\u03ec"+
		"\5\u009aN\2\u03df\u03ec\5\u00a2R\2\u03e0\u03ec\5\u00bc_\2\u03e1\u03ec"+
		"\5\u00c4c\2\u03e2\u03ec\5\u00dep\2\u03e3\u03ec\5\u0100\u0081\2\u03e4\u03ec"+
		"\5\u0106\u0084\2\u03e5\u03ec\5\u010c\u0087\2\u03e6\u03ec\5\u0120\u0091"+
		"\2\u03e7\u03ec\5\u0126\u0094\2\u03e8\u03ec\5\u0128\u0095\2\u03e9\u03ec"+
		"\5\u012c\u0097\2\u03ea\u03ec\5\u0132\u009a\2\u03eb\u03dd\3\2\2\2\u03eb"+
		"\u03de\3\2\2\2\u03eb\u03df\3\2\2\2\u03eb\u03e0\3\2\2\2\u03eb\u03e1\3\2"+
		"\2\2\u03eb\u03e2\3\2\2\2\u03eb\u03e3\3\2\2\2\u03eb\u03e4\3\2\2\2\u03eb"+
		"\u03e5\3\2\2\2\u03eb\u03e6\3\2\2\2\u03eb\u03e7\3\2\2\2\u03eb\u03e8\3\2"+
		"\2\2\u03eb\u03e9\3\2\2\2\u03eb\u03ea\3\2\2\2\u03ec\u008b\3\2\2\2\u03ed"+
		"\u03ef\5\u008aF\2\u03ee\u03ed\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03ee"+
		"\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u008d\3\2\2\2\u03f2\u03f4\5\6\4\2\u03f3"+
		"\u03f2\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u008f\3\2\2\2\u03f5\u03f7\7l"+
		"\2\2\u03f6\u03f8\5\6\4\2\u03f7\u03f6\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8"+
		"\u03f9\3\2\2\2\u03f9\u03fa\7o\2\2\u03fa\u0091\3\2\2\2\u03fb\u03fd\5\u0164"+
		"\u00b3\2\u03fc\u03fb\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe"+
		"\u0400\7(\2\2\u03ff\u0401\5\u0094K\2\u0400\u03ff\3\2\2\2\u0400\u0401\3"+
		"\2\2\2\u0401\u0402\3\2\2\2\u0402\u0403\5\u0096L\2\u0403\u0093\3\2\2\2"+
		"\u0404\u0405\t\5\2\2\u0405\u0095\3\2\2\2\u0406\u040c\5\u0098M\2\u0407"+
		"\u0408\5\u0098M\2\u0408\u0409\7k\2\2\u0409\u040a\5\u0096L\2\u040a\u040c"+
		"\3\2\2\2\u040b\u0406\3\2\2\2\u040b\u0407\3\2\2\2\u040c\u0097\3\2\2\2\u040d"+
		"\u0410\5\u01e0\u00f1\2\u040e\u0410\5\u01fa\u00fe\2\u040f\u040d\3\2\2\2"+
		"\u040f\u040e\3\2\2\2\u0410\u0099\3\2\2\2\u0411\u0413\5\u0164\u00b3\2\u0412"+
		"\u0411\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0415\3\2\2\2\u0414\u0416\5\u0146"+
		"\u00a4\2\u0415\u0414\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0417\3\2\2\2\u0417"+
		"\u0418\7\7\2\2\u0418\u0419\5\u009cO\2\u0419\u009b\3\2\2\2\u041a\u041f"+
		"\5\u009eP\2\u041b\u041c\7r\2\2\u041c\u041e\5\u009eP\2\u041d\u041b\3\2"+
		"\2\2\u041e\u0421\3\2\2\2\u041f\u041d\3\2\2\2\u041f\u0420\3\2\2\2\u0420"+
		"\u009d\3\2\2\2\u0421\u041f\3\2\2\2\u0422\u0424\5\u014a\u00a6\2\u0423\u0425"+
		"\5\u00a0Q\2\u0424\u0423\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u009f\3\2\2"+
		"\2\u0426\u0427\5\u01e6\u00f4\2\u0427\u0428\5\u016a\u00b6\2\u0428\u00a1"+
		"\3\2\2\2\u0429\u042a\5\u00a4S\2\u042a\u042b\5\u009cO\2\u042b\u044d\3\2"+
		"\2\2\u042c\u042d\5\u00a4S\2\u042d\u042e\5\u00a6T\2\u042e\u042f\5\u01c4"+
		"\u00e3\2\u042f\u0430\5\u0090I\2\u0430\u044d\3\2\2\2\u0431\u0432\5\u00a4"+
		"S\2\u0432\u0433\5\u00a6T\2\u0433\u0434\5\u01c4\u00e3\2\u0434\u0435\5\u00a8"+
		"U\2\u0435\u044d\3\2\2\2\u0436\u0437\5\u00a4S\2\u0437\u0438\5\u00a6T\2"+
		"\u0438\u0439\5\u01c4\u00e3\2\u0439\u043a\5\u00b0Y\2\u043a\u044d\3\2\2"+
		"\2\u043b\u043c\5\u00a4S\2\u043c\u043d\5\u00a6T\2\u043d\u043f\5\u01c4\u00e3"+
		"\2\u043e\u0440\5\u00a0Q\2\u043f\u043e\3\2\2\2\u043f\u0440\3\2\2\2\u0440"+
		"\u0441\3\2\2\2\u0441\u0442\5\u00b6\\\2\u0442\u044d\3\2\2\2\u0443\u0444"+
		"\5\u00a4S\2\u0444\u0445\5\u00a6T\2\u0445\u0446\5\u01c4\u00e3\2\u0446\u0448"+
		"\5\u01c4\u00e3\2\u0447\u0449\5\u00a0Q\2\u0448\u0447\3\2\2\2\u0448\u0449"+
		"\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044b\5\u00b6\\\2\u044b\u044d\3\2\2"+
		"\2\u044c\u0429\3\2\2\2\u044c\u042c\3\2\2\2\u044c\u0431\3\2\2\2\u044c\u0436"+
		"\3\2\2\2\u044c\u043b\3\2\2\2\u044c\u0443\3\2\2\2\u044d\u00a3\3\2\2\2\u044e"+
		"\u0450\5\u0164\u00b3\2\u044f\u044e\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u0452"+
		"\3\2\2\2\u0451\u0453\5\u0146\u00a4\2\u0452\u0451\3\2\2\2\u0452\u0453\3"+
		"\2\2\2\u0453\u0454\3\2\2\2\u0454\u0455\7\b\2\2\u0455\u00a5\3\2\2\2\u0456"+
		"\u0457\5\u01e0\u00f1\2\u0457\u00a7\3\2\2\2\u0458\u0459\7l\2\2\u0459\u045b"+
		"\5\u00aaV\2\u045a\u045c\5\u00acW\2\u045b\u045a\3\2\2\2\u045b\u045c\3\2"+
		"\2\2\u045c\u045d\3\2\2\2\u045d\u045e\7o\2\2\u045e\u0465\3\2\2\2\u045f"+
		"\u0460\7l\2\2\u0460\u0461\5\u00acW\2\u0461\u0462\5\u00aaV\2\u0462\u0463"+
		"\7o\2\2\u0463\u0465\3\2\2\2\u0464\u0458\3\2\2\2\u0464\u045f\3\2\2\2\u0465"+
		"\u00a9\3\2\2\2\u0466\u0468\5\u0164\u00b3\2\u0467\u0466\3\2\2\2\u0467\u0468"+
		"\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046a\7/\2\2\u046a\u046b\5\u0090I\2"+
		"\u046b\u00ab\3\2\2\2\u046c\u046e\5\u0164\u00b3\2\u046d\u046c\3\2\2\2\u046d"+
		"\u046e\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0471\7\60\2\2\u0470\u0472\5"+
		"\u00aeX\2\u0471\u0470\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0473\3\2\2\2"+
		"\u0473\u0474\5\u0090I\2\u0474\u00ad\3\2\2\2\u0475\u0476\7m\2\2\u0476\u0477"+
		"\5\u01e0\u00f1\2\u0477\u0478\7p\2\2\u0478\u00af\3\2\2\2\u0479\u047a\7"+
		"l\2\2\u047a\u047c\5\u00b2Z\2\u047b\u047d\5\u00b4[\2\u047c\u047b\3\2\2"+
		"\2\u047c\u047d\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u047f\7o\2\2\u047f\u0486"+
		"\3\2\2\2\u0480\u0481\7l\2\2\u0481\u0482\5\u00b4[\2\u0482\u0483\5\u00b2"+
		"Z\2\u0483\u0484\7o\2\2\u0484\u0486\3\2\2\2\u0485\u0479\3\2\2\2\u0485\u0480"+
		"\3\2\2\2\u0486\u00b1\3\2\2\2\u0487\u0489\5\u0164\u00b3\2\u0488\u0487\3"+
		"\2\2\2\u0488\u0489\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048b\7/\2\2\u048b"+
		"\u00b3\3\2\2\2\u048c\u048e\5\u0164\u00b3\2\u048d\u048c\3\2\2\2\u048d\u048e"+
		"\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0490\7\60\2\2\u0490\u00b5\3\2\2\2"+
		"\u0491\u0492\7l\2\2\u0492\u0494\5\u00b8]\2\u0493\u0495\5\u00ba^\2\u0494"+
		"\u0493\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0497\7o"+
		"\2\2\u0497\u049e\3\2\2\2\u0498\u0499\7l\2\2\u0499\u049a\5\u00ba^\2\u049a"+
		"\u049b\5\u00b8]\2\u049b\u049c\7o\2\2\u049c\u049e\3\2\2\2\u049d\u0491\3"+
		"\2\2\2\u049d\u0498\3\2\2\2\u049e\u00b7\3\2\2\2\u049f\u04a1\5\u0164\u00b3"+
		"\2\u04a0\u049f\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a4"+
		"\7\61\2\2\u04a3\u04a5\5\u00aeX\2\u04a4\u04a3\3\2\2\2\u04a4\u04a5\3\2\2"+
		"\2\u04a5\u04a6\3\2\2\2\u04a6\u04a7\5\u0090I\2\u04a7\u00b9\3\2\2\2\u04a8"+
		"\u04aa\5\u0164\u00b3\2\u04a9\u04a8\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ab"+
		"\3\2\2\2\u04ab\u04ad\7\62\2\2\u04ac\u04ae\5\u00aeX\2\u04ad\u04ac\3\2\2"+
		"\2\u04ad\u04ae\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b0\5\u0090I\2\u04b0"+
		"\u00bb\3\2\2\2\u04b1\u04b2\5\u00be`\2\u04b2\u04b3\5\u00c2b\2\u04b3\u00bd"+
		"\3\2\2\2\u04b4\u04b6\5\u0164\u00b3\2\u04b5\u04b4\3\2\2\2\u04b5\u04b6\3"+
		"\2\2\2\u04b6\u04b8\3\2\2\2\u04b7\u04b9\5\u0148\u00a5\2\u04b8\u04b7\3\2"+
		"\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04bb\7)\2\2\u04bb"+
		"\u04bc\5\u00c0a\2\u04bc\u00bf\3\2\2\2\u04bd\u04be\5\u01e0\u00f1\2\u04be"+
		"\u00c1\3\2\2\2\u04bf\u04c0\5\u01e6\u00f4\2\u04c0\u04c1\5\u01bc\u00df\2"+
		"\u04c1\u00c3\3\2\2\2\u04c2\u04c3\5\u00c6d\2\u04c3\u04c5\5\u00c8e\2\u04c4"+
		"\u04c6\5t;\2\u04c5\u04c4\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c7\3\2\2"+
		"\2\u04c7\u04c9\5\u00caf\2\u04c8\u04ca\5\u00ceh\2\u04c9\u04c8\3\2\2\2\u04c9"+
		"\u04ca\3\2\2\2\u04ca\u00c5\3\2\2\2\u04cb\u04cd\5\u0164\u00b3\2\u04cc\u04cb"+
		"\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u04cf\3\2\2\2\u04ce\u04d0\5\u0146\u00a4"+
		"\2\u04cf\u04ce\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d2"+
		"\7.\2\2\u04d2\u00c7\3\2\2\2\u04d3\u04d6\5\u01e0\u00f1\2\u04d4\u04d6\5"+
		"\u01fa\u00fe\2\u04d5\u04d3\3\2\2\2\u04d5\u04d4\3\2\2\2\u04d6\u00c9\3\2"+
		"\2\2\u04d7\u04d9\5\u00d0i\2\u04d8\u04da\7\63\2\2\u04d9\u04d8\3\2\2\2\u04d9"+
		"\u04da\3\2\2\2\u04da\u04dc\3\2\2\2\u04db\u04dd\5\u00ccg\2\u04dc\u04db"+
		"\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04e4\3\2\2\2\u04de\u04df\5\u00d0i"+
		"\2\u04df\u04e1\7\64\2\2\u04e0\u04e2\5\u00ccg\2\u04e1\u04e0\3\2\2\2\u04e1"+
		"\u04e2\3\2\2\2\u04e2\u04e4\3\2\2\2\u04e3\u04d7\3\2\2\2\u04e3\u04de\3\2"+
		"\2\2\u04e4\u00cb\3\2\2\2\u04e5\u04e7\5\u01ee\u00f8\2\u04e6\u04e8\5\u0164"+
		"\u00b3\2\u04e7\u04e6\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9"+
		"\u04ea\5\u01bc\u00df\2\u04ea\u00cd\3\2\2\2\u04eb\u04ec\5\u0090I\2\u04ec"+
		"\u00cf\3\2\2\2\u04ed\u04ef\5\u00d2j\2\u04ee\u04f0\5\u00d0i\2\u04ef\u04ee"+
		"\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u00d1\3\2\2\2\u04f1\u04f2\7m\2\2\u04f2"+
		"\u04f8\7p\2\2\u04f3\u04f4\7m\2\2\u04f4\u04f5\5\u00d4k\2\u04f5\u04f6\7"+
		"p\2\2\u04f6\u04f8\3\2\2\2\u04f7\u04f1\3\2\2\2\u04f7\u04f3\3\2\2\2\u04f8"+
		"\u00d3\3\2\2\2\u04f9\u04fe\5\u00d6l\2\u04fa\u04fb\7r\2\2\u04fb\u04fd\5"+
		"\u00d6l\2\u04fc\u04fa\3\2\2\2\u04fd\u0500\3\2\2\2\u04fe\u04fc\3\2\2\2"+
		"\u04fe\u04ff\3\2\2\2\u04ff\u00d5\3\2\2\2\u0500\u04fe\3\2\2\2\u0501\u0503"+
		"\7\7\2\2\u0502\u0501\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0505\3\2\2\2\u0504"+
		"\u0506\5\u00d8m\2\u0505\u0504\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0507"+
		"\3\2\2\2\u0507\u0509\5\u00dan\2\u0508\u050a\5\u01c4\u00e3\2\u0509\u0508"+
		"\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050c\3\2\2\2\u050b\u050d\5\u00dco"+
		"\2\u050c\u050b\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u0528\3\2\2\2\u050e\u0510"+
		"\7\b\2\2\u050f\u0511\5\u00d8m\2\u0510\u050f\3\2\2\2\u0510\u0511\3\2\2"+
		"\2\u0511\u0512\3\2\2\2\u0512\u0514\5\u00dan\2\u0513\u0515\5\u01c4\u00e3"+
		"\2\u0514\u0513\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0517\3\2\2\2\u0516\u0518"+
		"\5\u00dco\2\u0517\u0516\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u0528\3\2\2"+
		"\2\u0519\u051b\7\65\2\2\u051a\u051c\5\u00d8m\2\u051b\u051a\3\2\2\2\u051b"+
		"\u051c\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u051e\5\u00dan\2\u051e\u051f"+
		"\5\u01c4\u00e3\2\u051f\u0528\3\2\2\2\u0520\u0522\5\u00d8m\2\u0521\u0520"+
		"\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0524\5\u00dan"+
		"\2\u0524\u0525\5\u01c4\u00e3\2\u0525\u0526\5\u01f0\u00f9\2\u0526\u0528"+
		"\3\2\2\2\u0527\u0502\3\2\2\2\u0527\u050e\3\2\2\2\u0527\u0519\3\2\2\2\u0527"+
		"\u0521\3\2\2\2\u0528\u00d7\3\2\2\2\u0529\u052c\5\u01e0\u00f1\2\u052a\u052c"+
		"\7w\2\2\u052b\u0529\3\2\2\2\u052b\u052a\3\2\2\2\u052c\u00d9\3\2\2\2\u052d"+
		"\u0530\5\u01e0\u00f1\2\u052e\u0530\7w\2\2\u052f\u052d\3\2\2\2\u052f\u052e"+
		"\3\2\2\2\u0530\u00db\3\2\2\2\u0531\u0532\5\u01e6\u00f4\2\u0532\u0533\5"+
		"\u016a\u00b6\2\u0533\u00dd\3\2\2\2\u0534\u0536\5\u0164\u00b3\2\u0535\u0534"+
		"\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u0538\3\2\2\2\u0537\u0539\5\u0148\u00a5"+
		"\2\u0538\u0537\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u0543"+
		"\5\u00e0q\2\u053b\u053d\5\u0164\u00b3\2\u053c\u053b\3\2\2\2\u053c\u053d"+
		"\3\2\2\2\u053d\u053f\3\2\2\2\u053e\u0540\5\u0148\u00a5\2\u053f\u053e\3"+
		"\2\2\2\u053f\u0540\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0543\5\u00f0y\2"+
		"\u0542\u0535\3\2\2\2\u0542\u053c\3\2\2\2\u0543\u00df\3\2\2\2\u0544\u0546"+
		"\7\66\2\2\u0545\u0544\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u0547\3\2\2\2"+
		"\u0547\u0548\7,\2\2\u0548\u054a\5\u00ecw\2\u0549\u054b\5t;\2\u054a\u0549"+
		"\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u054d\3\2\2\2\u054c\u054e\5\u01da\u00ee"+
		"\2\u054d\u054c\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0551"+
		"\7l\2\2\u0550\u0552\5\u00e2r\2\u0551\u0550\3\2\2\2\u0551\u0552\3\2\2\2"+
		"\u0552\u0553\3\2\2\2\u0553\u0554\7o\2\2\u0554\u00e1\3\2\2\2\u0555\u0557"+
		"\5\u00e4s\2\u0556\u0558\5\u00e2r\2\u0557\u0556\3\2\2\2\u0557\u0558\3\2"+
		"\2\2\u0558\u00e3\3\2\2\2\u0559\u055c\5\u008aF\2\u055a\u055c\5\u00e6t\2"+
		"\u055b\u0559\3\2\2\2\u055b\u055a\3\2\2\2\u055c\u00e5\3\2\2\2\u055d\u055f"+
		"\5\u0164\u00b3\2\u055e\u055d\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u0561\3"+
		"\2\2\2\u0560\u0562\7\66\2\2\u0561\u0560\3\2\2\2\u0561\u0562\3\2\2\2\u0562"+
		"\u0563\3\2\2\2\u0563\u0564\7\4\2\2\u0564\u0565\5\u00e8u\2\u0565\u00e7"+
		"\3\2\2\2\u0566\u056c\5\u00eav\2\u0567\u0568\5\u00eav\2\u0568\u0569\7r"+
		"\2\2\u0569\u056a\5\u00e8u\2\u056a\u056c\3\2\2\2\u056b\u0566\3\2\2\2\u056b"+
		"\u0567\3\2\2\2\u056c\u00e9\3\2\2\2\u056d\u056f\5\u00eex\2\u056e\u0570"+
		"\5\u01ca\u00e6\2\u056f\u056e\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u00eb\3"+
		"\2\2\2\u0571\u0572\5\u01e0\u00f1\2\u0572\u00ed\3\2\2\2\u0573\u0574\5\u01e0"+
		"\u00f1\2\u0574\u00ef\3\2\2\2\u0575\u0576\7,\2\2\u0576\u0578\5\u00ecw\2"+
		"\u0577\u0579\5t;\2\u0578\u0577\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057a"+
		"\3\2\2\2\u057a\u057b\5\u01da\u00ee\2\u057b\u057c\7l\2\2\u057c\u057d\5"+
		"\u00f2z\2\u057d\u057e\7o\2\2\u057e\u00f1\3\2\2\2\u057f\u0581\5\u00f4{"+
		"\2\u0580\u0582\5\u00f2z\2\u0581\u0580\3\2\2\2\u0581\u0582\3\2\2\2\u0582"+
		"\u00f3\3\2\2\2\u0583\u0586\5\u008aF\2\u0584\u0586\5\u00f6|\2\u0585\u0583"+
		"\3\2\2\2\u0585\u0584\3\2\2\2\u0586\u00f5\3\2\2\2\u0587\u0589\5\u0164\u00b3"+
		"\2\u0588\u0587\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058a\3\2\2\2\u058a\u058b"+
		"\7\4\2\2\u058b\u058c\5\u00f8}\2\u058c\u00f7\3\2\2\2\u058d\u0593\5\u00fa"+
		"~\2\u058e\u058f\5\u00fa~\2\u058f\u0590\7r\2\2\u0590\u0591\5\u00f8}\2\u0591"+
		"\u0593\3\2\2\2\u0592\u058d\3\2\2\2\u0592\u058e\3\2\2\2\u0593\u00f9\3\2"+
		"\2\2\u0594\u0596\5\u00eex\2\u0595\u0597\5\u00fc\177\2\u0596\u0595\3\2"+
		"\2\2\u0596\u0597\3\2\2\2\u0597\u00fb\3\2\2\2\u0598\u0599\5\u01e6\u00f4"+
		"\2\u0599\u059a\5\u00fe\u0080\2\u059a\u00fd\3\2\2\2\u059b\u059f\5\u0206"+
		"\u0104\2\u059c\u059f\7\u008e\2\2\u059d\u059f\5\u0208\u0105\2\u059e\u059b"+
		"\3\2\2\2\u059e\u059c\3\2\2\2\u059e\u059d\3\2\2\2\u059f\u00ff\3\2\2\2\u05a0"+
		"\u05a2\5\u0164\u00b3\2\u05a1\u05a0\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a4"+
		"\3\2\2\2\u05a3\u05a5\5\u0148\u00a5\2\u05a4\u05a3\3\2\2\2\u05a4\u05a5\3"+
		"\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05a7\7*\2\2\u05a7\u05a9\5\u0102\u0082"+
		"\2\u05a8\u05aa\5t;\2\u05a9\u05a8\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ac"+
		"\3\2\2\2\u05ab\u05ad\5\u01da\u00ee\2\u05ac\u05ab\3\2\2\2\u05ac\u05ad\3"+
		"\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05af\5\u0104\u0083\2\u05af\u0101\3\2"+
		"\2\2\u05b0\u05b1\5\u01e0\u00f1\2\u05b1\u0103\3\2\2\2\u05b2\u05b4\7l\2"+
		"\2\u05b3\u05b5\5\u008cG\2\u05b4\u05b3\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5"+
		"\u05b6\3\2\2\2\u05b6\u05b7\7o\2\2\u05b7\u0105\3\2\2\2\u05b8\u05ba\5\u0164"+
		"\u00b3\2\u05b9\u05b8\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bc\3\2\2\2\u05bb"+
		"\u05bd\5\u0148\u00a5\2\u05bc\u05bb\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05be"+
		"\3\2\2\2\u05be\u05bf\7+\2\2\u05bf\u05c1\5\u0108\u0085\2\u05c0\u05c2\5"+
		"t;\2\u05c1\u05c0\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c4\3\2\2\2\u05c3"+
		"\u05c5\5\u01da\u00ee\2\u05c4\u05c3\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c6"+
		"\3\2\2\2\u05c6\u05c7\5\u010a\u0086\2\u05c7\u0107\3\2\2\2\u05c8\u05c9\5"+
		"\u01e0\u00f1\2\u05c9\u0109\3\2\2\2\u05ca\u05cc\7l\2\2\u05cb\u05cd\5\u008c"+
		"G\2\u05cc\u05cb\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce"+
		"\u05cf\7o\2\2\u05cf\u010b\3\2\2\2\u05d0\u05d2\5\u0164\u00b3\2\u05d1\u05d0"+
		"\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05d4\3\2\2\2\u05d3\u05d5\5\u0148\u00a5"+
		"\2\u05d4\u05d3\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u05d7"+
		"\7-\2\2\u05d7\u05d9\5\u010e\u0088\2\u05d8\u05da\5\u01da\u00ee\2\u05d9"+
		"\u05d8\3\2\2\2\u05d9\u05da\3\2\2\2\u05da\u05db\3\2\2\2\u05db\u05dc\5\u0110"+
		"\u0089\2\u05dc\u010d\3\2\2\2\u05dd\u05de\5\u01e0\u00f1\2\u05de\u010f\3"+
		"\2\2\2\u05df\u05e1\7l\2\2\u05e0\u05e2\5\u0114\u008b\2\u05e1\u05e0\3\2"+
		"\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e4\7o\2\2\u05e4"+
		"\u0111\3\2\2\2\u05e5\u05eb\5\u0116\u008c\2\u05e6\u05eb\5\u0118\u008d\2"+
		"\u05e7\u05eb\5\u011a\u008e\2\u05e8\u05eb\5\u011c\u008f\2\u05e9\u05eb\5"+
		"\u011e\u0090\2\u05ea\u05e5\3\2\2\2\u05ea\u05e6\3\2\2\2\u05ea\u05e7\3\2"+
		"\2\2\u05ea\u05e8\3\2\2\2\u05ea\u05e9\3\2\2\2\u05eb\u0113\3\2\2\2\u05ec"+
		"\u05ee\5\u0112\u008a\2\u05ed\u05ef\5\u0114\u008b\2\u05ee\u05ed\3\2\2\2"+
		"\u05ee\u05ef\3\2\2\2\u05ef\u0115\3\2\2\2\u05f0\u05f1\5\u00a4S\2\u05f1"+
		"\u05f2\5\u00a6T\2\u05f2\u05f3\5\u01c4\u00e3\2\u05f3\u05f4\5\u00b0Y\2\u05f4"+
		"\u0117\3\2\2\2\u05f5\u05f6\5\u00c6d\2\u05f6\u05f8\5\u00c8e\2\u05f7\u05f9"+
		"\5t;\2\u05f8\u05f7\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa"+
		"\u05fb\5\u00caf\2\u05fb\u0119\3\2\2\2\u05fc\u05fe\5\u0122\u0092\2\u05fd"+
		"\u05ff\5t;\2\u05fe\u05fd\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0600\3\2\2"+
		"\2\u0600\u0602\5\u00d2j\2\u0601\u0603\7\63\2\2\u0602\u0601\3\2\2\2\u0602"+
		"\u0603\3\2\2\2\u0603\u060c\3\2\2\2\u0604\u0606\5\u0122\u0092\2\u0605\u0607"+
		"\5t;\2\u0606\u0605\3\2\2\2\u0606\u0607\3\2\2\2\u0607\u0608\3\2\2\2\u0608"+
		"\u0609\5\u00d2j\2\u0609\u060a\7\64\2\2\u060a\u060c\3\2\2\2\u060b\u05fc"+
		"\3\2\2\2\u060b\u0604\3\2\2\2\u060c\u011b\3\2\2\2\u060d\u060e\5\u012e\u0098"+
		"\2\u060e\u060f\5\u0130\u0099\2\u060f\u0610\5\u00b0Y\2\u0610\u011d\3\2"+
		"\2\2\u0611\u0613\5\u0164\u00b3\2\u0612\u0611\3\2\2\2\u0612\u0613\3\2\2"+
		"\2\u0613\u0615\3\2\2\2\u0614\u0616\5\u0148\u00a5\2\u0615\u0614\3\2\2\2"+
		"\u0615\u0616\3\2\2\2\u0616\u0617\3\2\2\2\u0617\u0618\7\67\2\2\u0618\u061a"+
		"\5\u00c0a\2\u0619\u061b\5\u01da\u00ee\2\u061a\u0619\3\2\2\2\u061a\u061b"+
		"\3\2\2\2\u061b\u061d\3\2\2\2\u061c\u061e\5\u00c2b\2\u061d\u061c\3\2\2"+
		"\2\u061d\u061e\3\2\2\2\u061e\u011f\3\2\2\2\u061f\u0621\5\u0122\u0092\2"+
		"\u0620\u0622\5t;\2\u0621\u0620\3\2\2\2\u0621\u0622\3\2\2\2\u0622\u0623"+
		"\3\2\2\2\u0623\u0625\5\u00d2j\2\u0624\u0626\7\63\2\2\u0625\u0624\3\2\2"+
		"\2\u0625\u0626\3\2\2\2\u0626\u0627\3\2\2\2\u0627\u0628\5\u0124\u0093\2"+
		"\u0628\u0632\3\2\2\2\u0629\u062b\5\u0122\u0092\2\u062a\u062c\5t;\2\u062b"+
		"\u062a\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u062e\5\u00d2"+
		"j\2\u062e\u062f\7\64\2\2\u062f\u0630\5\u0124\u0093\2\u0630\u0632\3\2\2"+
		"\2\u0631\u061f\3\2\2\2\u0631\u0629\3\2\2\2\u0632\u0121\3\2\2\2\u0633\u0635"+
		"\5\u0164\u00b3\2\u0634\u0633\3\2\2\2\u0634\u0635\3\2\2\2\u0635\u0637\3"+
		"\2\2\2\u0636\u0638\5\u0146\u00a4\2\u0637\u0636\3\2\2\2\u0637\u0638\3\2"+
		"\2\2\u0638\u0639\3\2\2\2\u0639\u064b\78\2\2\u063a\u063c\5\u0164\u00b3"+
		"\2\u063b\u063a\3\2\2\2\u063b\u063c\3\2\2\2\u063c\u063e\3\2\2\2\u063d\u063f"+
		"\5\u0146\u00a4\2\u063e\u063d\3\2\2\2\u063e\u063f\3\2\2\2\u063f\u0640\3"+
		"\2\2\2\u0640\u0641\78\2\2\u0641\u064b\7y\2\2\u0642\u0644\5\u0164\u00b3"+
		"\2\u0643\u0642\3\2\2\2\u0643\u0644\3\2\2\2\u0644\u0646\3\2\2\2\u0645\u0647"+
		"\5\u0146\u00a4\2\u0646\u0645\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u0648\3"+
		"\2\2\2\u0648\u0649\78\2\2\u0649\u064b\7x\2\2\u064a\u0634\3\2\2\2\u064a"+
		"\u063b\3\2\2\2\u064a\u0643\3\2\2\2\u064b\u0123\3\2\2\2\u064c\u064d\5\u0090"+
		"I\2\u064d\u0125\3\2\2\2\u064e\u0650\5\u0164\u00b3\2\u064f\u064e\3\2\2"+
		"\2\u064f\u0650\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0652\79\2\2\u0652\u0653"+
		"\5\u0090I\2\u0653\u0127\3\2\2\2\u0654\u0656\5\u0148\u00a5\2\u0655\u0654"+
		"\3\2\2\2\u0655\u0656\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u0658\7:\2\2\u0658"+
		"\u065a\5\u01c6\u00e4\2\u0659\u065b\5\u01da\u00ee\2\u065a\u0659\3\2\2\2"+
		"\u065a\u065b\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u065d\5\u012a\u0096\2\u065d"+
		"\u0129\3\2\2\2\u065e\u0660\7l\2\2\u065f\u0661\5\u008cG\2\u0660\u065f\3"+
		"\2\2\2\u0660\u0661\3\2\2\2\u0661\u0662\3\2\2\2\u0662\u0663\7o\2\2\u0663"+
		"\u012b\3\2\2\2\u0664\u0665\5\u012e\u0098\2\u0665\u0666\5\u0130\u0099\2"+
		"\u0666\u0667\5\u0090I\2\u0667\u0671\3\2\2\2\u0668\u0669\5\u012e\u0098"+
		"\2\u0669\u066a\5\u0130\u0099\2\u066a\u066b\5\u00a8U\2\u066b\u0671\3\2"+
		"\2\2\u066c\u066d\5\u012e\u0098\2\u066d\u066e\5\u0130\u0099\2\u066e\u066f"+
		"\5\u00b0Y\2\u066f\u0671\3\2\2\2\u0670\u0664\3\2\2\2\u0670\u0668\3\2\2"+
		"\2\u0670\u066c\3\2\2\2\u0671\u012d\3\2\2\2\u0672\u0674\5\u0164\u00b3\2"+
		"\u0673\u0672\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u0676\3\2\2\2\u0675\u0677"+
		"\5\u0146\u00a4\2\u0676\u0675\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u0678\3"+
		"\2\2\2\u0678\u0679\7;\2\2\u0679\u067a\5\u00d2j\2\u067a\u012f\3\2\2\2\u067b"+
		"\u067d\5\u01ee\u00f8\2\u067c\u067e\5\u0164\u00b3\2\u067d\u067c\3\2\2\2"+
		"\u067d\u067e\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u0680\5\u01bc\u00df\2\u0680"+
		"\u0131\3\2\2\2\u0681\u0685\5\u0134\u009b\2\u0682\u0685\5\u0136\u009c\2"+
		"\u0683\u0685\5\u0138\u009d\2\u0684\u0681\3\2\2\2\u0684\u0682\3\2\2\2\u0684"+
		"\u0683\3\2\2\2\u0685\u0133\3\2\2\2\u0686\u0687\7<\2\2\u0687\u0688\7=\2"+
		"\2\u0688\u0689\5\u01fa\u00fe\2\u0689\u068a\7l\2\2\u068a\u068b\7o\2\2\u068b"+
		"\u0135\3\2\2\2\u068c\u068d\7>\2\2\u068d\u068e\7=\2\2\u068e\u068f\5\u01fa"+
		"\u00fe\2\u068f\u0690\7l\2\2\u0690\u0691\7o\2\2\u0691\u0137\3\2\2\2\u0692"+
		"\u0693\7?\2\2\u0693\u0694\7=\2\2\u0694\u0695\5\u01fa\u00fe\2\u0695\u0696"+
		"\7l\2\2\u0696\u0697\5\u013a\u009e\2\u0697\u0698\7o\2\2\u0698\u0139\3\2"+
		"\2\2\u0699\u069b\5\u013c\u009f\2\u069a\u0699\3\2\2\2\u069a\u069b\3\2\2"+
		"\2\u069b\u069d\3\2\2\2\u069c\u069e\5\u0140\u00a1\2\u069d\u069c\3\2\2\2"+
		"\u069d\u069e\3\2\2\2\u069e\u013b\3\2\2\2\u069f\u06a0\7@\2\2\u06a0\u06a1"+
		"\5\u013e\u00a0\2\u06a1\u013d\3\2\2\2\u06a2\u06a3\5\u020c\u0107\2\u06a3"+
		"\u013f\3\2\2\2\u06a4\u06a5\7A\2\2\u06a5\u06a6\5\u0142\u00a2\2\u06a6\u0141"+
		"\3\2\2\2\u06a7\u06a8\t\6\2\2\u06a8\u0143\3\2\2\2\u06a9\u06c3\7+\2\2\u06aa"+
		"\u06c3\7E\2\2\u06ab\u06c3\7F\2\2\u06ac\u06c3\7G\2\2\u06ad\u06c3\7?\2\2"+
		"\u06ae\u06c3\7H\2\2\u06af\u06c3\7I\2\2\u06b0\u06c3\7J\2\2\u06b1\u06c3"+
		"\7K\2\2\u06b2\u06c3\7L\2\2\u06b3\u06c3\7>\2\2\u06b4\u06c3\7<\2\2\u06b5"+
		"\u06c3\7M\2\2\u06b6\u06c3\7N\2\2\u06b7\u06c3\7O\2\2\u06b8\u06b9\7O\2\2"+
		"\u06b9\u06ba\7m\2\2\u06ba\u06bb\7P\2\2\u06bb\u06c3\7p\2\2\u06bc\u06bd"+
		"\7O\2\2\u06bd\u06be\7m\2\2\u06be\u06bf\7Q\2\2\u06bf\u06c3\7p\2\2\u06c0"+
		"\u06c3\7R\2\2\u06c1\u06c3\5\u0148\u00a5\2\u06c2\u06a9\3\2\2\2\u06c2\u06aa"+
		"\3\2\2\2\u06c2\u06ab\3\2\2\2\u06c2\u06ac\3\2\2\2\u06c2\u06ad\3\2\2\2\u06c2"+
		"\u06ae\3\2\2\2\u06c2\u06af\3\2\2\2\u06c2\u06b0\3\2\2\2\u06c2\u06b1\3\2"+
		"\2\2\u06c2\u06b2\3\2\2\2\u06c2\u06b3\3\2\2\2\u06c2\u06b4\3\2\2\2\u06c2"+
		"\u06b5\3\2\2\2\u06c2\u06b6\3\2\2\2\u06c2\u06b7\3\2\2\2\u06c2\u06b8\3\2"+
		"\2\2\u06c2\u06bc\3\2\2\2\u06c2\u06c0\3\2\2\2\u06c2\u06c1\3\2\2\2\u06c3"+
		"\u0145\3\2\2\2\u06c4\u06c6\5\u0144\u00a3\2\u06c5\u06c7\5\u0146\u00a4\2"+
		"\u06c6\u06c5\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7\u0147\3\2\2\2\u06c8\u06d8"+
		"\7S\2\2\u06c9\u06ca\7S\2\2\u06ca\u06cb\7m\2\2\u06cb\u06cc\7\60\2\2\u06cc"+
		"\u06d8\7p\2\2\u06cd\u06d8\7T\2\2\u06ce\u06cf\7T\2\2\u06cf\u06d0\7m\2\2"+
		"\u06d0\u06d1\7\60\2\2\u06d1\u06d8\7p\2\2\u06d2\u06d8\7U\2\2\u06d3\u06d4"+
		"\7U\2\2\u06d4\u06d5\7m\2\2\u06d5\u06d6\7\60\2\2\u06d6\u06d8\7p\2\2\u06d7"+
		"\u06c8\3\2\2\2\u06d7\u06c9\3\2\2\2\u06d7\u06cd\3\2\2\2\u06d7\u06ce\3\2"+
		"\2\2\u06d7\u06d2\3\2\2\2\u06d7\u06d3\3\2\2\2\u06d8\u0149\3\2\2\2\u06d9"+
		"\u06da\b\u00a6\1\2\u06da\u06dc\5\u014c\u00a7\2\u06db\u06dd\5\u01c4\u00e3"+
		"\2\u06dc\u06db\3\2\2\2\u06dc\u06dd\3\2\2\2\u06dd\u06ed\3\2\2\2\u06de\u06e0"+
		"\5\u014e\u00a8\2\u06df\u06e1\5\u01c4\u00e3\2\u06e0\u06df\3\2\2\2\u06e0"+
		"\u06e1\3\2\2\2\u06e1\u06ed\3\2\2\2\u06e2\u06ed\5\u0150\u00a9\2\u06e3\u06e5"+
		"\5\u0152\u00aa\2\u06e4\u06e6\5\u01c4\u00e3\2\u06e5\u06e4\3\2\2\2\u06e5"+
		"\u06e6\3\2\2\2\u06e6\u06ed\3\2\2\2\u06e7\u06ed\5\u0158\u00ad\2\u06e8\u06ed"+
		"\5\u015a\u00ae\2\u06e9\u06ea\7V\2\2\u06ea\u06ed\5\u01bc\u00df\2\u06eb"+
		"\u06ed\5\u015c\u00af\2\u06ec\u06d9\3\2\2\2\u06ec\u06de\3\2\2\2\u06ec\u06e2"+
		"\3\2\2\2\u06ec\u06e3\3\2\2\2\u06ec\u06e7\3\2\2\2\u06ec\u06e8\3\2\2\2\u06ec"+
		"\u06e9\3\2\2\2\u06ec\u06eb\3\2\2\2\u06ed\u06f3\3\2\2\2\u06ee\u06ef\f\4"+
		"\2\2\u06ef\u06f0\7W\2\2\u06f0\u06f2\5\u01bc\u00df\2\u06f1\u06ee\3\2\2"+
		"\2\u06f2\u06f5\3\2\2\2\u06f3\u06f1\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u014b"+
		"\3\2\2\2\u06f5\u06f3\3\2\2\2\u06f6\u06f7\7w\2\2\u06f7\u014d\3\2\2\2\u06f8"+
		"\u06f9\5\u01e0\u00f1\2\u06f9\u014f\3\2\2\2\u06fa\u06fb\7\b\2\2\u06fb\u06ff"+
		"\5\u014a\u00a6\2\u06fc\u06fd\7\7\2\2\u06fd\u06ff\5\u014a\u00a6\2\u06fe"+
		"\u06fa\3\2\2\2\u06fe\u06fc\3\2\2\2\u06ff\u0151\3\2\2\2\u0700\u0702\7m"+
		"\2\2\u0701\u0703\5\u0154\u00ab\2\u0702\u0701\3\2\2\2\u0702\u0703\3\2\2"+
		"\2\u0703\u0704\3\2\2\2\u0704\u0705\7p\2\2\u0705\u0153\3\2\2\2\u0706\u070b"+
		"\5\u0156\u00ac\2\u0707\u0708\7r\2\2\u0708\u070a\5\u0156\u00ac\2\u0709"+
		"\u0707\3\2\2\2\u070a\u070d\3\2\2\2\u070b\u0709\3\2\2\2\u070b\u070c\3\2"+
		"\2\2\u070c\u0155\3\2\2\2\u070d\u070b\3\2\2\2\u070e\u070f\5\u014a\u00a6"+
		"\2\u070f\u0157\3\2\2\2\u0710\u0712\5\u01c6\u00e4\2\u0711\u0710\3\2\2\2"+
		"\u0711\u0712\3\2\2\2\u0712\u0713\3\2\2\2\u0713\u0714\7k\2\2\u0714\u0716"+
		"\5\u00eex\2\u0715\u0717\5\u0152\u00aa\2\u0716\u0715\3\2\2\2\u0716\u0717"+
		"\3\2\2\2\u0717\u0159\3\2\2\2\u0718\u0719\5\u014e\u00a8\2\u0719\u071a\7"+
		"y\2\2\u071a\u015b\3\2\2\2\u071b\u071c\5\u016a\u00b6\2\u071c\u015d\3\2"+
		"\2\2\u071d\u071f\7z\2\2\u071e\u071d\3\2\2\2\u071e\u071f\3\2\2\2\u071f"+
		"\u0720\3\2\2\2\u0720\u0722\5\u0160\u00b1\2\u0721\u0723\5\u0162\u00b2\2"+
		"\u0722\u0721\3\2\2\2\u0722\u0723\3\2\2\2\u0723\u015f\3\2\2\2\u0724\u0725"+
		"\5\u01e0\u00f1\2\u0725\u0161\3\2\2\2\u0726\u0728\7m\2\2\u0727\u0729\5"+
		"\u0166\u00b4\2\u0728\u0727\3\2\2\2\u0728\u0729\3\2\2\2\u0729\u072a\3\2"+
		"\2\2\u072a\u072b\7p\2\2\u072b\u0163\3\2\2\2\u072c\u072e\5\u015e\u00b0"+
		"\2\u072d\u072c\3\2\2\2\u072e\u072f\3\2\2\2\u072f\u072d\3\2\2\2\u072f\u0730"+
		"\3\2\2\2\u0730\u0165\3\2\2\2\u0731\u0733\5\u0168\u00b5\2\u0732\u0731\3"+
		"\2\2\2\u0733\u0734\3\2\2\2\u0734\u0732\3\2\2\2\u0734\u0735\3\2\2\2\u0735"+
		"\u0167\3\2\2\2\u0736\u0738\7m\2\2\u0737\u0739\5\u0166\u00b4\2\u0738\u0737"+
		"\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u073a\3\2\2\2\u073a\u074b\7p\2\2\u073b"+
		"\u073d\7n\2\2\u073c\u073e\5\u0166\u00b4\2\u073d\u073c\3\2\2\2\u073d\u073e"+
		"\3\2\2\2\u073e\u073f\3\2\2\2\u073f\u074b\7q\2\2\u0740\u0742\7l\2\2\u0741"+
		"\u0743\5\u0166\u00b4\2\u0742\u0741\3\2\2\2\u0742\u0743\3\2\2\2\u0743\u0744"+
		"\3\2\2\2\u0744\u074b\7o\2\2\u0745\u074b\5\u01e0\u00f1\2\u0746\u074b\5"+
		"\u016a\u00b6\2\u0747\u074b\5\u01e4\u00f3\2\u0748\u074b\5\u0204\u0103\2"+
		"\u0749\u074b\5\u01fa\u00fe\2\u074a\u0736\3\2\2\2\u074a\u073b\3\2\2\2\u074a"+
		"\u0740\3\2\2\2\u074a\u0745\3\2\2\2\u074a\u0746\3\2\2\2\u074a\u0747\3\2"+
		"\2\2\u074a\u0748\3\2\2\2\u074a\u0749\3\2\2\2\u074b\u0169\3\2\2\2\u074c"+
		"\u074e\5\u0172\u00ba\2\u074d\u074c\3\2\2\2\u074d\u074e\3\2\2\2\u074e\u074f"+
		"\3\2\2\2\u074f\u0751\5\u016e\u00b8\2\u0750\u0752\5\u0176\u00bc\2\u0751"+
		"\u0750\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u016b\3\2\2\2\u0753\u0758\5\u016a"+
		"\u00b6\2\u0754\u0755\7r\2\2\u0755\u0757\5\u016a\u00b6\2\u0756\u0754\3"+
		"\2\2\2\u0757\u075a\3\2\2\2\u0758\u0756\3\2\2\2\u0758\u0759\3\2\2\2\u0759"+
		"\u016d\3\2\2\2\u075a\u0758\3\2\2\2\u075b\u075c\5\u01f6\u00fc\2\u075c\u075d"+
		"\5\u01b2\u00da\2\u075d\u0761\3\2\2\2\u075e\u0761\5\u01b2\u00da\2\u075f"+
		"\u0761\5\u0170\u00b9\2\u0760\u075b\3\2\2\2\u0760\u075e\3\2\2\2\u0760\u075f"+
		"\3\2\2\2\u0761\u016f\3\2\2\2\u0762\u0763\7{\2\2\u0763\u0764\5\u01e0\u00f1"+
		"\2\u0764\u0171\3\2\2\2\u0765\u076b\7X\2\2\u0766\u0767\7X\2\2\u0767\u076b"+
		"\7y\2\2\u0768\u0769\7X\2\2\u0769\u076b\7x\2\2\u076a\u0765\3\2\2\2\u076a"+
		"\u0766\3\2\2\2\u076a\u0768\3\2\2\2\u076b\u0173\3\2\2\2\u076c\u076d\5\u01f4"+
		"\u00fb\2\u076d\u076e\5\u016e\u00b8\2\u076e\u0777\3\2\2\2\u076f\u0771\5"+
		"\u0178\u00bd\2\u0770\u0772\5\u0172\u00ba\2\u0771\u0770\3\2\2\2\u0771\u0772"+
		"\3\2\2\2\u0772\u0773\3\2\2\2\u0773\u0774\5\u016e\u00b8\2\u0774\u0777\3"+
		"\2\2\2\u0775\u0777\5\u017a\u00be\2\u0776\u076c\3\2\2\2\u0776\u076f\3\2"+
		"\2\2\u0776\u0775\3\2\2\2\u0777\u0175\3\2\2\2\u0778\u077a\5\u0174\u00bb"+
		"\2\u0779\u0778\3\2\2\2\u077a\u077b\3\2\2\2\u077b\u0779\3\2\2\2\u077b\u077c"+
		"\3\2\2\2\u077c\u0177\3\2\2\2\u077d\u077f\7y\2\2\u077e\u0780\5\u0172\u00ba"+
		"\2\u077f\u077e\3\2\2\2\u077f\u0780\3\2\2\2\u0780\u0781\3\2\2\2\u0781\u0782"+
		"\5\u016a\u00b6\2\u0782\u0783\7s\2\2\u0783\u0179\3\2\2\2\u0784\u0785\7"+
		"V\2\2\u0785\u078f\5\u01bc\u00df\2\u0786\u0787\7W\2\2\u0787\u078f\5\u01bc"+
		"\u00df\2\u0788\u0789\7W\2\2\u0789\u078a\7y\2\2\u078a\u078f\5\u01bc\u00df"+
		"\2\u078b\u078c\7W\2\2\u078c\u078d\7x\2\2\u078d\u078f\5\u01bc\u00df\2\u078e"+
		"\u0784\3\2\2\2\u078e\u0786\3\2\2\2\u078e\u0788\3\2\2\2\u078e\u078b\3\2"+
		"\2\2\u078f\u017b\3\2\2\2\u0790\u0792\5\u01e0\u00f1\2\u0791\u0793\5\u0084"+
		"C\2\u0792\u0791\3\2\2\2\u0792\u0793\3\2\2\2\u0793\u079c\3\2\2\2\u0794"+
		"\u079c\5\u0180\u00c1\2\u0795\u079c\5\u0190\u00c9\2\u0796\u079c\5\u0192"+
		"\u00ca\2\u0797\u079c\5\u019a\u00ce\2\u0798\u079c\5\u01a8\u00d5\2\u0799"+
		"\u079c\5\u01ae\u00d8\2\u079a\u079c\5\u01b0\u00d9\2\u079b\u0790\3\2\2\2"+
		"\u079b\u0794\3\2\2\2\u079b\u0795\3\2\2\2\u079b\u0796\3\2\2\2\u079b\u0797"+
		"\3\2\2\2\u079b\u0798\3\2\2\2\u079b\u0799\3\2\2\2\u079b\u079a\3\2\2\2\u079c"+
		"\u017d\3\2\2\2\u079d\u079e\7k\2\2\u079e\u079f\5\u01e0\u00f1\2\u079f\u017f"+
		"\3\2\2\2\u07a0\u07a8\5\u0204\u0103\2\u07a1\u07a8\5\u0182\u00c2\2\u07a2"+
		"\u07a8\5\u0188\u00c5\2\u07a3\u07a8\7Y\2\2\u07a4\u07a8\7Z\2\2\u07a5\u07a8"+
		"\7[\2\2\u07a6\u07a8\7\\\2\2\u07a7\u07a0\3\2\2\2\u07a7\u07a1\3\2\2\2\u07a7"+
		"\u07a2\3\2\2\2\u07a7\u07a3\3\2\2\2\u07a7\u07a4\3\2\2\2\u07a7\u07a5\3\2"+
		"\2\2\u07a7\u07a6\3\2\2\2\u07a8\u0181\3\2\2\2\u07a9\u07ab\7n\2\2\u07aa"+
		"\u07ac\5\u0184\u00c3\2\u07ab\u07aa\3\2\2\2\u07ab\u07ac\3\2\2\2\u07ac\u07ad"+
		"\3\2\2\2\u07ad\u07ae\7q\2\2\u07ae\u0183\3\2\2\2\u07af\u07b4\5\u0186\u00c4"+
		"\2\u07b0\u07b1\7r\2\2\u07b1\u07b3\5\u0186\u00c4\2\u07b2\u07b0\3\2\2\2"+
		"\u07b3\u07b6\3\2\2\2\u07b4\u07b2\3\2\2\2\u07b4\u07b5\3\2\2\2\u07b5\u07b8"+
		"\3\2\2\2\u07b6\u07b4\3\2\2\2\u07b7\u07b9\7r\2\2\u07b8\u07b7\3\2\2\2\u07b8"+
		"\u07b9\3\2\2\2\u07b9\u0185\3\2\2\2\u07ba\u07bb\5\u016a\u00b6\2\u07bb\u0187"+
		"\3\2\2\2\u07bc\u07bd\7n\2\2\u07bd\u07be\5\u018a\u00c6\2\u07be\u07bf\7"+
		"q\2\2\u07bf\u07c2\3\2\2\2\u07c0\u07c2\5\u018e\u00c8\2\u07c1\u07bc\3\2"+
		"\2\2\u07c1\u07c0\3\2\2\2\u07c2\u0189\3\2\2\2\u07c3\u07c8\5\u018c\u00c7"+
		"\2\u07c4\u07c5\7r\2\2\u07c5\u07c7\5\u018c\u00c7\2\u07c6\u07c4\3\2\2\2"+
		"\u07c7\u07ca\3\2\2\2\u07c8\u07c6\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9\u07cc"+
		"\3\2\2\2\u07ca\u07c8\3\2\2\2\u07cb\u07cd\7r\2\2\u07cc\u07cb\3\2\2\2\u07cc"+
		"\u07cd\3\2\2\2\u07cd\u018b\3\2\2\2\u07ce\u07cf\5\u016a\u00b6\2\u07cf\u07d0"+
		"\7s\2\2\u07d0\u07d1\5\u016a\u00b6\2\u07d1\u018d\3\2\2\2\u07d2\u07d3\7"+
		"n\2\2\u07d3\u07d4\7s\2\2\u07d4\u07d5\7q\2\2\u07d5\u018f\3\2\2\2\u07d6"+
		"\u07e3\7]\2\2\u07d7\u07d8\7]\2\2\u07d8\u07d9\7k\2\2\u07d9\u07e3\5\u01e0"+
		"\u00f1\2\u07da\u07db\7]\2\2\u07db\u07dc\7n\2\2\u07dc\u07dd\5\u016c\u00b7"+
		"\2\u07dd\u07de\7q\2\2\u07de\u07e3\3\2\2\2\u07df\u07e0\7]\2\2\u07e0\u07e1"+
		"\7k\2\2\u07e1\u07e3\78\2\2\u07e2\u07d6\3\2\2\2\u07e2\u07d7\3\2\2\2\u07e2"+
		"\u07da\3\2\2\2\u07e2\u07df\3\2\2\2\u07e3\u0191\3\2\2\2\u07e4\u07e8\5\u0194"+
		"\u00cb\2\u07e5\u07e8\5\u0196\u00cc\2\u07e6\u07e8\5\u0198\u00cd\2\u07e7"+
		"\u07e4\3\2\2\2\u07e7\u07e5\3\2\2\2\u07e7\u07e6\3\2\2\2\u07e8\u0193\3\2"+
		"\2\2\u07e9\u07ea\7^\2\2\u07ea\u07eb\7k\2\2\u07eb\u07ec\5\u01e0\u00f1\2"+
		"\u07ec\u0195\3\2\2\2\u07ed\u07ee\7^\2\2\u07ee\u07ef\7n\2\2\u07ef\u07f0"+
		"\5\u016a\u00b6\2\u07f0\u07f1\7q\2\2\u07f1\u0197\3\2\2\2\u07f2\u07f3\7"+
		"^\2\2\u07f3\u07f4\7k\2\2\u07f4\u07f5\78\2\2\u07f5\u0199\3\2\2\2\u07f6"+
		"\u07f9\5\u019c\u00cf\2\u07f7\u07f9\5\u01fa\u00fe\2\u07f8\u07f6\3\2\2\2"+
		"\u07f8\u07f7\3\2\2\2\u07f9\u019b\3\2\2\2\u07fa\u07fc\7l\2\2\u07fb\u07fd"+
		"\5\u019e\u00d0\2\u07fc\u07fb\3\2\2\2\u07fc\u07fd\3\2\2\2\u07fd\u07ff\3"+
		"\2\2\2\u07fe\u0800\5\6\4\2\u07ff\u07fe\3\2\2\2\u07ff\u0800\3\2\2\2\u0800"+
		"\u0801\3\2\2\2\u0801\u0802\7o\2\2\u0802\u019d\3\2\2\2\u0803\u0805\5\u00d2"+
		"j\2\u0804\u0806\5\u00ccg\2\u0805\u0804\3\2\2\2\u0805\u0806\3\2\2\2\u0806"+
		"\u0807\3\2\2\2\u0807\u0808\7\5\2\2\u0808\u0821\3\2\2\2\u0809\u080b\5\u01e2"+
		"\u00f2\2\u080a\u080c\5\u00ccg\2\u080b\u080a\3\2\2\2\u080b\u080c\3\2\2"+
		"\2\u080c\u080d\3\2\2\2\u080d\u080e\7\5\2\2\u080e\u0821\3\2\2\2\u080f\u0810"+
		"\5\u01a0\u00d1\2\u0810\u0812\5\u00d2j\2\u0811\u0813\5\u00ccg\2\u0812\u0811"+
		"\3\2\2\2\u0812\u0813\3\2\2\2\u0813\u0814\3\2\2\2\u0814\u0815\7\5\2\2\u0815"+
		"\u0821\3\2\2\2\u0816\u0817\5\u01a0\u00d1\2\u0817\u0819\5\u01e2\u00f2\2"+
		"\u0818\u081a\5\u00ccg\2\u0819\u0818\3\2\2\2\u0819\u081a\3\2\2\2\u081a"+
		"\u081b\3\2\2\2\u081b\u081c\7\5\2\2\u081c\u0821\3\2\2\2\u081d\u081e\5\u01a0"+
		"\u00d1\2\u081e\u081f\7\5\2\2\u081f\u0821\3\2\2\2\u0820\u0803\3\2\2\2\u0820"+
		"\u0809\3\2\2\2\u0820\u080f\3\2\2\2\u0820\u0816\3\2\2\2\u0820\u081d\3\2"+
		"\2\2\u0821\u019f\3\2\2\2\u0822\u0823\7n\2\2\u0823\u0824\5\u01a2\u00d2"+
		"\2\u0824\u0825\7q\2\2\u0825\u01a1\3\2\2\2\u0826\u082b\5\u01a4\u00d3\2"+
		"\u0827\u0828\7r\2\2\u0828\u082a\5\u01a4\u00d3\2\u0829\u0827\3\2\2\2\u082a"+
		"\u082d\3\2\2\2\u082b\u0829\3\2\2\2\u082b\u082c\3\2\2\2\u082c\u01a3\3\2"+
		"\2\2\u082d\u082b\3\2\2\2\u082e\u0830\5\u01a6\u00d4\2\u082f\u082e\3\2\2"+
		"\2\u082f\u0830\3\2\2\2\u0830\u0831\3\2\2\2\u0831\u0832\5\u016a\u00b6\2"+
		"\u0832\u01a5\3\2\2\2\u0833\u0834\t\7\2\2\u0834\u01a7\3\2\2\2\u0835\u0837"+
		"\7m\2\2\u0836\u0838\5\u01aa\u00d6\2\u0837\u0836\3\2\2\2\u0837\u0838\3"+
		"\2\2\2\u0838\u0839\3\2\2\2\u0839\u083a\7p\2\2\u083a\u01a9\3\2\2\2\u083b"+
		"\u0840\5\u01ac\u00d7\2\u083c\u083d\7r\2\2\u083d\u083f\5\u01ac\u00d7\2"+
		"\u083e\u083c\3\2\2\2\u083f\u0842\3\2\2\2\u0840\u083e\3\2\2\2\u0840\u0841"+
		"\3\2\2\2\u0841\u01ab\3\2\2\2\u0842\u0840\3\2\2\2\u0843\u0849\5\u016a\u00b6"+
		"\2\u0844\u0845\5\u01e0\u00f1\2\u0845\u0846\7s\2\2\u0846\u0847\5\u016a"+
		"\u00b6\2\u0847\u0849\3\2\2\2\u0848\u0843\3\2\2\2\u0848\u0844\3\2\2\2\u0849"+
		"\u01ad\3\2\2\2\u084a\u084b\7w\2\2\u084b\u01af\3\2\2\2\u084c\u084d\7a\2"+
		"\2\u084d\u084e\7m\2\2\u084e\u084f\5\u016a\u00b6\2\u084f\u0850\7p\2\2\u0850"+
		"\u01b1\3\2\2\2\u0851\u0852\b\u00da\1\2\u0852\u0853\5\u017c\u00bf\2\u0853"+
		"\u0858\3\2\2\2\u0854\u0855\f\3\2\2\u0855\u0857\5\u01b4\u00db\2\u0856\u0854"+
		"\3\2\2\2\u0857\u085a\3\2\2\2\u0858\u0856\3\2\2\2\u0858\u0859\3\2\2\2\u0859"+
		"\u01b3\3\2\2\2\u085a\u0858\3\2\2\2\u085b\u085d\7y\2\2\u085c\u085b\3\2"+
		"\2\2\u085c\u085d\3\2\2\2\u085d\u085f\3\2\2\2\u085e\u0860\5\u01a8\u00d5"+
		"\2\u085f\u085e\3\2\2\2\u085f\u0860\3\2\2\2\u0860\u0861\3\2\2\2\u0861\u0899"+
		"\5\u01ba\u00de\2\u0862\u0864\7y\2\2\u0863\u0862\3\2\2\2\u0863\u0864\3"+
		"\2\2\2\u0864\u0865\3\2\2\2\u0865\u0899\5\u01a8\u00d5\2\u0866\u0868\7y"+
		"\2\2\u0867\u0866\3\2\2\2\u0867\u0868\3\2\2\2\u0868\u0869\3\2\2\2\u0869"+
		"\u086a\7k\2\2\u086a\u0899\78\2\2\u086b\u086d\7y\2\2\u086c\u086b\3\2\2"+
		"\2\u086c\u086d\3\2\2\2\u086d\u086e\3\2\2\2\u086e\u086f\7k\2\2\u086f\u0870"+
		"\78\2\2\u0870\u0871\7m\2\2\u0871\u0872\5\u01b6\u00dc\2\u0872\u0873\7p"+
		"\2\2\u0873\u0899\3\2\2\2\u0874\u0876\7y\2\2\u0875\u0874\3\2\2\2\u0875"+
		"\u0876\3\2\2\2\u0876\u0877\3\2\2\2\u0877\u0878\7k\2\2\u0878\u087a\5\u01e0"+
		"\u00f1\2\u0879\u087b\5\u0084C\2\u087a\u0879\3\2\2\2\u087a\u087b\3\2\2"+
		"\2\u087b\u0899\3\2\2\2\u087c\u087e\7y\2\2\u087d\u087c\3\2\2\2\u087d\u087e"+
		"\3\2\2\2\u087e\u087f\3\2\2\2\u087f\u0880\7k\2\2\u0880\u0899\7\u008a\2"+
		"\2\u0881\u0883\7y\2\2\u0882\u0881\3\2\2\2\u0882\u0883\3\2\2\2\u0883\u0884"+
		"\3\2\2\2\u0884\u0885\7k\2\2\u0885\u0899\7\u008d\2\2\u0886\u0888\7y\2\2"+
		"\u0887\u0886\3\2\2\2\u0887\u0888\3\2\2\2\u0888\u0889\3\2\2\2\u0889\u088a"+
		"\7k\2\2\u088a\u0899\7]\2\2\u088b\u088d\7y\2\2\u088c\u088b\3\2\2\2\u088c"+
		"\u088d\3\2\2\2\u088d\u088e\3\2\2\2\u088e\u088f\7k\2\2\u088f\u0899\7b\2"+
		"\2\u0890\u0892\7y\2\2\u0891\u0890\3\2\2\2\u0891\u0892\3\2\2\2\u0892\u0893"+
		"\3\2\2\2\u0893\u0894\7n\2\2\u0894\u0895\5\u016c\u00b7\2\u0895\u0896\7"+
		"q\2\2\u0896\u0899\3\2\2\2\u0897\u0899\5\u01f8\u00fd\2\u0898\u085c\3\2"+
		"\2\2\u0898\u0863\3\2\2\2\u0898\u0867\3\2\2\2\u0898\u086c\3\2\2\2\u0898"+
		"\u0875\3\2\2\2\u0898\u087d\3\2\2\2\u0898\u0882\3\2\2\2\u0898\u0887\3\2"+
		"\2\2\u0898\u088c\3\2\2\2\u0898\u0891\3\2\2\2\u0898\u0897\3\2\2\2\u0899"+
		"\u01b5\3\2\2\2\u089a\u089c\5\u01b8\u00dd\2\u089b\u089d\5\u01b6\u00dc\2"+
		"\u089c\u089b\3\2\2\2\u089c\u089d\3\2\2\2\u089d\u01b7\3\2\2\2\u089e\u089f"+
		"\5\u01e0\u00f1\2\u089f\u08a0\7s\2\2\u08a0\u01b9\3\2\2\2\u08a1\u08a2\5"+
		"\u019c\u00cf\2\u08a2\u01bb\3\2\2\2\u08a3\u08a4\b\u00df\1\2\u08a4\u08aa"+
		"\5\u01c0\u00e1\2\u08a5\u08aa\5\u01c2\u00e2\2\u08a6\u08aa\5\u01c6\u00e4"+
		"\2\u08a7\u08aa\5\u01ca\u00e6\2\u08a8\u08aa\5\u01d4\u00eb\2\u08a9\u08a3"+
		"\3\2\2\2\u08a9\u08a5\3\2\2\2\u08a9\u08a6\3\2\2\2\u08a9\u08a7\3\2\2\2\u08a9"+
		"\u08a8\3\2\2\2\u08aa\u08c3\3\2\2\2\u08ab\u08ad\f\13\2\2\u08ac\u08ae\7"+
		"\63\2\2\u08ad\u08ac\3\2\2\2\u08ad\u08ae\3\2\2\2\u08ae\u08af\3\2\2\2\u08af"+
		"\u08b0\5\u01ee\u00f8\2\u08b0\u08b1\5\u01bc\u00df\f\u08b1\u08c2\3\2\2\2"+
		"\u08b2\u08b3\f\n\2\2\u08b3\u08b4\7\64\2\2\u08b4\u08b5\5\u01ee\u00f8\2"+
		"\u08b5\u08b6\5\u01bc\u00df\13\u08b6\u08c2\3\2\2\2\u08b7\u08b8\f\7\2\2"+
		"\u08b8\u08c2\5\u01be\u00e0\2\u08b9\u08ba\f\6\2\2\u08ba\u08c2\7x\2\2\u08bb"+
		"\u08bc\f\4\2\2\u08bc\u08bd\7k\2\2\u08bd\u08c2\7c\2\2\u08be\u08bf\f\3\2"+
		"\2\u08bf\u08c0\7k\2\2\u08c0\u08c2\7d\2\2\u08c1\u08ab\3\2\2\2\u08c1\u08b2"+
		"\3\2\2\2\u08c1\u08b7\3\2\2\2\u08c1\u08b9\3\2\2\2\u08c1\u08bb\3\2\2\2\u08c1"+
		"\u08be\3\2\2\2\u08c2\u08c5\3\2\2\2\u08c3\u08c1\3\2\2\2\u08c3\u08c4\3\2"+
		"\2\2\u08c4\u01bd\3\2\2\2\u08c5\u08c3\3\2\2\2\u08c6\u08c7\7y\2\2\u08c7"+
		"\u01bf\3\2\2\2\u08c8\u08c9\7n\2\2\u08c9\u08ca\5\u01bc\u00df\2\u08ca\u08cb"+
		"\7q\2\2\u08cb\u01c1\3\2\2\2\u08cc\u08cd\7n\2\2\u08cd\u08ce\5\u01bc\u00df"+
		"\2\u08ce\u08cf\7s\2\2\u08cf\u08d0\5\u01bc\u00df\2\u08d0\u08d1\7q\2\2\u08d1"+
		"\u01c3\3\2\2\2\u08d2\u08d4\7s\2\2\u08d3\u08d5\5\u0164\u00b3\2\u08d4\u08d3"+
		"\3\2\2\2\u08d4\u08d5\3\2\2\2\u08d5\u08d6\3\2\2\2\u08d6\u08d7\5\u01bc\u00df"+
		"\2\u08d7\u01c5\3\2\2\2\u08d8\u08da\5\u01c8\u00e5\2\u08d9\u08db\5\u0084"+
		"C\2\u08da\u08d9\3\2\2\2\u08da\u08db\3\2\2\2\u08db\u08e4\3\2\2\2\u08dc"+
		"\u08de\5\u01c8\u00e5\2\u08dd\u08df\5\u0084C\2\u08de\u08dd\3\2\2\2\u08de"+
		"\u08df\3\2\2\2\u08df\u08e0\3\2\2\2\u08e0\u08e1\7k\2\2\u08e1\u08e2\5\u01c6"+
		"\u00e4\2\u08e2\u08e4\3\2\2\2\u08e3\u08d8\3\2\2\2\u08e3\u08dc\3\2\2\2\u08e4"+
		"\u01c7\3\2\2\2\u08e5\u08e6\5\u01e0\u00f1\2\u08e6\u01c9\3\2\2\2\u08e7\u08e9"+
		"\7m\2\2\u08e8\u08ea\5\u01cc\u00e7\2\u08e9\u08e8\3\2\2\2\u08e9\u08ea\3"+
		"\2\2\2\u08ea\u08eb\3\2\2\2\u08eb\u08ec\7p\2\2\u08ec\u01cb\3\2\2\2\u08ed"+
		"\u08ef\5\u01ce\u00e8\2\u08ee\u08f0\5\u01f0\u00f9\2\u08ef\u08ee\3\2\2\2"+
		"\u08ef\u08f0\3\2\2\2\u08f0\u01cd\3\2\2\2\u08f1\u08f7\5\u01d0\u00e9\2\u08f2"+
		"\u08f3\5\u01d0\u00e9\2\u08f3\u08f4\7r\2\2\u08f4\u08f5\5\u01ce\u00e8\2"+
		"\u08f5\u08f7\3\2\2\2\u08f6\u08f1\3\2\2\2\u08f6\u08f2\3\2\2\2\u08f7\u01cf"+
		"\3\2\2\2\u08f8\u08fa\5\u0164\u00b3\2\u08f9\u08f8\3\2\2\2\u08f9\u08fa\3"+
		"\2\2\2\u08fa\u08fc\3\2\2\2\u08fb\u08fd\7\65\2\2\u08fc\u08fb\3\2\2\2\u08fc"+
		"\u08fd\3\2\2\2\u08fd\u08fe\3\2\2\2\u08fe\u0906\5\u01bc\u00df\2\u08ff\u0901"+
		"\7\65\2\2\u0900\u08ff\3\2\2\2\u0900\u0901\3\2\2\2\u0901\u0902\3\2\2\2"+
		"\u0902\u0903\5\u01d2\u00ea\2\u0903\u0904\5\u01c4\u00e3\2\u0904\u0906\3"+
		"\2\2\2\u0905\u08f9\3\2\2\2\u0905\u0900\3\2\2\2\u0906\u01d1\3\2\2\2\u0907"+
		"\u0908\5\u01e0\u00f1\2\u0908\u01d3\3\2\2\2\u0909\u090a\7-\2\2\u090a\u090c"+
		"\7u\2\2\u090b\u090d\5\u01d6\u00ec\2\u090c\u090b\3\2\2\2\u090c\u090d\3"+
		"\2\2\2\u090d\u090e\3\2\2\2\u090e\u090f\7v\2\2\u090f\u01d5\3\2\2\2\u0910"+
		"\u0918\5\u01d8\u00ed\2\u0911\u0912\7r\2\2\u0912\u0914\5\u01d8\u00ed\2"+
		"\u0913\u0911\3\2\2\2\u0914\u0915\3\2\2\2\u0915\u0913\3\2\2\2\u0915\u0916"+
		"\3\2\2\2\u0916\u0918\3\2\2\2\u0917\u0910\3\2\2\2\u0917\u0913\3\2\2\2\u0918"+
		"\u01d7\3\2\2\2\u0919\u091a\5\u01c6\u00e4\2\u091a\u01d9\3\2\2\2\u091b\u091c"+
		"\7s\2\2\u091c\u091d\5\u01de\u00f0\2\u091d\u091e\7r\2\2\u091e\u091f\5\u01dc"+
		"\u00ef\2\u091f\u0925\3\2\2\2\u0920\u0921\7s\2\2\u0921\u0925\5\u01de\u00f0"+
		"\2\u0922\u0923\7s\2\2\u0923\u0925\5\u01dc\u00ef\2\u0924\u091b\3\2\2\2"+
		"\u0924\u0920\3\2\2\2\u0924\u0922\3\2\2\2\u0925\u01db\3\2\2\2\u0926\u092c"+
		"\5\u01c6\u00e4\2\u0927\u0928\5\u01c6\u00e4\2\u0928\u0929\7r\2\2\u0929"+
		"\u092a\5\u01dc\u00ef\2\u092a\u092c\3\2\2\2\u092b\u0926\3\2\2\2\u092b\u0927"+
		"\3\2\2\2\u092c\u01dd\3\2\2\2\u092d\u092e\7+\2\2\u092e\u01df\3\2\2\2\u092f"+
		"\u0936\7j\2\2\u0930\u0931\7e\2\2\u0931\u0932\7j\2\2\u0932\u0936\7e\2\2"+
		"\u0933\u0936\7\u0087\2\2\u0934\u0936\5\u01e4\u00f3\2\u0935\u092f\3\2\2"+
		"\2\u0935\u0930\3\2\2\2\u0935\u0933\3\2\2\2\u0935\u0934\3\2\2\2\u0936\u01e1"+
		"\3\2\2\2\u0937\u093c\5\u01e0\u00f1\2\u0938\u0939\7r\2\2\u0939\u093b\5"+
		"\u01e0\u00f1\2\u093a\u0938\3\2\2\2\u093b\u093e\3\2\2\2\u093c\u093a\3\2"+
		"\2\2\u093c\u093d\3\2\2\2\u093d\u01e3\3\2\2\2\u093e\u093c\3\2\2\2\u093f"+
		"\u0940\t\b\2\2\u0940\u01e5\3\2\2\2\u0941\u0942\6\u00f4\f\2\u0942\u0943"+
		"\7}\2\2\u0943\u01e7\3\2\2\2\u0944\u0945\6\u00f5\r\2\u0945\u0946\7|\2\2"+
		"\u0946\u01e9\3\2\2\2\u0947\u0948\6\u00f6\16\2\u0948\u0949\7{\2\2\u0949"+
		"\u094a\7{\2\2\u094a\u01eb\3\2\2\2\u094b\u094c\6\u00f7\17\2\u094c\u094d"+
		"\7~\2\2\u094d\u094e\7~\2\2\u094e\u01ed\3\2\2\2\u094f\u0950\6\u00f8\20"+
		"\2\u0950\u0951\7|\2\2\u0951\u0952\7v\2\2\u0952\u01ef\3\2\2\2\u0953\u0954"+
		"\6\u00f9\21\2\u0954\u0955\7k\2\2\u0955\u0956\7k\2\2\u0956\u0957\7k\2\2"+
		"\u0957\u01f1\3\2\2\2\u0958\u0959\6\u00fa\22\2\u0959\u095a\7}\2\2\u095a"+
		"\u095b\7}\2\2\u095b\u01f3\3\2\2\2\u095c\u095d\6\u00fb\23\2\u095d\u095e"+
		"\5\u01fa\u00fe\2\u095e\u01f5\3\2\2\2\u095f\u0960\6\u00fc\24\2\u0960\u0961"+
		"\5\u01fa\u00fe\2\u0961\u01f7\3\2\2\2\u0962\u0963\6\u00fd\25\2\u0963\u0964"+
		"\5\u01fa\u00fe\2\u0964\u01f9\3\2\2\2\u0965\u096a\5\u01fe\u0100\2\u0966"+
		"\u0967\6\u00fe\26\2\u0967\u0969\5\u01fc\u00ff\2\u0968\u0966\3\2\2\2\u0969"+
		"\u096c\3\2\2\2\u096a\u0968\3\2\2\2\u096a\u096b\3\2\2\2\u096b\u0976\3\2"+
		"\2\2\u096c\u096a\3\2\2\2\u096d\u0972\5\u0200\u0101\2\u096e\u096f\6\u00fe"+
		"\27\2\u096f\u0971\5\u0202\u0102\2\u0970\u096e\3\2\2\2\u0971\u0974\3\2"+
		"\2\2\u0972\u0970\3\2\2\2\u0972\u0973\3\2\2\2\u0973\u0976\3\2\2\2\u0974"+
		"\u0972\3\2\2\2\u0975\u0965\3\2\2\2\u0975\u096d\3\2\2\2\u0976\u01fb\3\2"+
		"\2\2\u0977\u097a\5\u01fe\u0100\2\u0978\u097a\7\u0086\2\2\u0979\u0977\3"+
		"\2\2\2\u0979\u0978\3\2\2\2\u097a\u01fd\3\2\2\2\u097b\u097e\t\t\2\2\u097c"+
		"\u097e\7\u0085\2\2\u097d\u097b\3\2\2\2\u097d\u097c\3\2\2\2\u097e\u01ff"+
		"\3\2\2\2\u097f\u0980\7k\2\2\u0980\u0981\7k\2\2\u0981\u0201\3\2\2\2\u0982"+
		"\u0985\7k\2\2\u0983\u0985\5\u01fc\u00ff\2\u0984\u0982\3\2\2\2\u0984\u0983"+
		"\3\2\2\2\u0985\u0203\3\2\2\2\u0986\u098b\5\u0206\u0104\2\u0987\u098b\5"+
		"\u020e\u0108\2\u0988\u098b\5\u0208\u0105\2\u0989\u098b\5\u020a\u0106\2"+
		"\u098a\u0986\3\2\2\2\u098a\u0987\3\2\2\2\u098a\u0988\3\2\2\2\u098a\u0989"+
		"\3\2\2\2\u098b\u0205\3\2\2\2\u098c\u098e\5\u01e8\u00f5\2\u098d\u098c\3"+
		"\2\2\2\u098d\u098e\3\2\2\2\u098e\u098f\3\2\2\2\u098f\u0995\5\u020c\u0107"+
		"\2\u0990\u0992\5\u01e8\u00f5\2\u0991\u0990\3\2\2\2\u0991\u0992\3\2\2\2"+
		"\u0992\u0993\3\2\2\2\u0993\u0995\7\u008d\2\2\u0994\u098d\3\2\2\2\u0994"+
		"\u0991\3\2\2\2\u0995\u0207\3\2\2\2\u0996\u0997\t\n\2\2\u0997\u0209\3\2"+
		"\2\2\u0998\u0999\7h\2\2\u0999\u020b\3\2\2\2\u099a\u099b\t\13\2\2\u099b"+
		"\u020d\3\2\2\2\u099c\u099d\t\f\2\2\u099d\u020f\3\2\2\2\u012d\u0213\u021a"+
		"\u021e\u0222\u0226\u022a\u022e\u0232\u0236\u0239\u023e\u0246\u024a\u024e"+
		"\u0252\u0258\u025c\u0260\u0264\u0268\u026c\u0272\u0284\u028b\u0291\u0297"+
		"\u029b\u029e\u02a8\u02b0\u02bb\u02c1\u02c7\u02d2\u02d8\u02e0\u02e8\u02ec"+
		"\u02f1\u0304\u0310\u0314\u0318\u031e\u032a\u0338\u033c\u0340\u0343\u0349"+
		"\u034e\u0351\u0354\u035a\u035f\u0363\u036f\u0379\u037b\u0388\u0393\u039c"+
		"\u03a5\u03b1\u03bb\u03bf\u03c9\u03d8\u03eb\u03f0\u03f3\u03f7\u03fc\u0400"+
		"\u040b\u040f\u0412\u0415\u041f\u0424\u043f\u0448\u044c\u044f\u0452\u045b"+
		"\u0464\u0467\u046d\u0471\u047c\u0485\u0488\u048d\u0494\u049d\u04a0\u04a4"+
		"\u04a9\u04ad\u04b5\u04b8\u04c5\u04c9\u04cc\u04cf\u04d5\u04d9\u04dc\u04e1"+
		"\u04e3\u04e7\u04ef\u04f7\u04fe\u0502\u0505\u0509\u050c\u0510\u0514\u0517"+
		"\u051b\u0521\u0527\u052b\u052f\u0535\u0538\u053c\u053f\u0542\u0545\u054a"+
		"\u054d\u0551\u0557\u055b\u055e\u0561\u056b\u056f\u0578\u0581\u0585\u0588"+
		"\u0592\u0596\u059e\u05a1\u05a4\u05a9\u05ac\u05b4\u05b9\u05bc\u05c1\u05c4"+
		"\u05cc\u05d1\u05d4\u05d9\u05e1\u05ea\u05ee\u05f8\u05fe\u0602\u0606\u060b"+
		"\u0612\u0615\u061a\u061d\u0621\u0625\u062b\u0631\u0634\u0637\u063b\u063e"+
		"\u0643\u0646\u064a\u064f\u0655\u065a\u0660\u0670\u0673\u0676\u067d\u0684"+
		"\u069a\u069d\u06c2\u06c6\u06d7\u06dc\u06e0\u06e5\u06ec\u06f3\u06fe\u0702"+
		"\u070b\u0711\u0716\u071e\u0722\u0728\u072f\u0734\u0738\u073d\u0742\u074a"+
		"\u074d\u0751\u0758\u0760\u076a\u0771\u0776\u077b\u077f\u078e\u0792\u079b"+
		"\u07a7\u07ab\u07b4\u07b8\u07c1\u07c8\u07cc\u07e2\u07e7\u07f8\u07fc\u07ff"+
		"\u0805\u080b\u0812\u0819\u0820\u082b\u082f\u0837\u0840\u0848\u0858\u085c"+
		"\u085f\u0863\u0867\u086c\u0875\u087a\u087d\u0882\u0887\u088c\u0891\u0898"+
		"\u089c\u08a9\u08ad\u08c1\u08c3\u08d4\u08da\u08de\u08e3\u08e9\u08ef\u08f6"+
		"\u08f9\u08fc\u0900\u0905\u090c\u0915\u0917\u0924\u092b\u0935\u093c\u096a"+
		"\u0972\u0975\u0979\u097d\u0984\u098a\u098d\u0991\u0994";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}