// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.outputs;

import io.pulumi.aws.wafregional.outputs.XssMatchSetXssMatchTupleFieldToMatch;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class XssMatchSetXssMatchTuple {
    /**
     * Specifies where in a web request to look for cross-site scripting attacks.
     * 
     */
    private final XssMatchSetXssMatchTupleFieldToMatch fieldToMatch;
    /**
     * Which text transformation, if any, to perform on the web request before inspecting the request for cross-site scripting attacks.
     * 
     */
    private final String textTransformation;

    @CustomType.Constructor
    private XssMatchSetXssMatchTuple(
        @CustomType.Parameter("fieldToMatch") XssMatchSetXssMatchTupleFieldToMatch fieldToMatch,
        @CustomType.Parameter("textTransformation") String textTransformation) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformation = textTransformation;
    }

    /**
     * Specifies where in a web request to look for cross-site scripting attacks.
     * 
    */
    public XssMatchSetXssMatchTupleFieldToMatch fieldToMatch() {
        return this.fieldToMatch;
    }
    /**
     * Which text transformation, if any, to perform on the web request before inspecting the request for cross-site scripting attacks.
     * 
    */
    public String textTransformation() {
        return this.textTransformation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(XssMatchSetXssMatchTuple defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private XssMatchSetXssMatchTupleFieldToMatch fieldToMatch;
        private String textTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(XssMatchSetXssMatchTuple defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformation = defaults.textTransformation;
        }

        public Builder fieldToMatch(XssMatchSetXssMatchTupleFieldToMatch fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }
        public Builder textTransformation(String textTransformation) {
            this.textTransformation = Objects.requireNonNull(textTransformation);
            return this;
        }        public XssMatchSetXssMatchTuple build() {
            return new XssMatchSetXssMatchTuple(fieldToMatch, textTransformation);
        }
    }
}
