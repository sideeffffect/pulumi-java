// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.outputs.RuleGroupFieldToMatch;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupTextTransformation;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RuleGroupRegexPatternSetReferenceStatement {
    private final String arn;
    private final RuleGroupFieldToMatch fieldToMatch;
    private final List<RuleGroupTextTransformation> textTransformations;

    @OutputCustomType.Constructor
    private RuleGroupRegexPatternSetReferenceStatement(
        @OutputCustomType.Parameter("arn") String arn,
        @OutputCustomType.Parameter("fieldToMatch") RuleGroupFieldToMatch fieldToMatch,
        @OutputCustomType.Parameter("textTransformations") List<RuleGroupTextTransformation> textTransformations) {
        this.arn = arn;
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = textTransformations;
    }

    public String getArn() {
        return this.arn;
    }
    public RuleGroupFieldToMatch getFieldToMatch() {
        return this.fieldToMatch;
    }
    public List<RuleGroupTextTransformation> getTextTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRegexPatternSetReferenceStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private RuleGroupFieldToMatch fieldToMatch;
        private List<RuleGroupTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRegexPatternSetReferenceStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder fieldToMatch(RuleGroupFieldToMatch fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder textTransformations(List<RuleGroupTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public RuleGroupRegexPatternSetReferenceStatement build() {
            return new RuleGroupRegexPatternSetReferenceStatement(arn, fieldToMatch, textTransformations);
        }
    }
}
