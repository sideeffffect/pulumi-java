// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.outputs.WebACLFieldToMatch;
import io.pulumi.awsnative.wafv2.outputs.WebACLTextTransformation;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class WebACLXssMatchStatement {
    private final WebACLFieldToMatch fieldToMatch;
    private final List<WebACLTextTransformation> textTransformations;

    @OutputCustomType.Constructor
    private WebACLXssMatchStatement(
        @OutputCustomType.Parameter("fieldToMatch") WebACLFieldToMatch fieldToMatch,
        @OutputCustomType.Parameter("textTransformations") List<WebACLTextTransformation> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = textTransformations;
    }

    public WebACLFieldToMatch getFieldToMatch() {
        return this.fieldToMatch;
    }
    public List<WebACLTextTransformation> getTextTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLXssMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLFieldToMatch fieldToMatch;
        private List<WebACLTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLXssMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(WebACLFieldToMatch fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder textTransformations(List<WebACLTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public WebACLXssMatchStatement build() {
            return new WebACLXssMatchStatement(fieldToMatch, textTransformations);
        }
    }
}
