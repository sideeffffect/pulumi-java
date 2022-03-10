// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetActiveReceiptRuleSetResult {
    /**
     * The SES receipt rule set ARN.
     * 
     */
    private final String arn;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The name of the rule set
     * 
     */
    private final String ruleSetName;

    @OutputCustomType.Constructor
    private GetActiveReceiptRuleSetResult(
        @OutputCustomType.Parameter("arn") String arn,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("ruleSetName") String ruleSetName) {
        this.arn = arn;
        this.id = id;
        this.ruleSetName = ruleSetName;
    }

    /**
     * The SES receipt rule set ARN.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the rule set
     * 
    */
    public String getRuleSetName() {
        return this.ruleSetName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetActiveReceiptRuleSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String id;
        private String ruleSetName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetActiveReceiptRuleSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.ruleSetName = defaults.ruleSetName;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder ruleSetName(String ruleSetName) {
            this.ruleSetName = Objects.requireNonNull(ruleSetName);
            return this;
        }
        public GetActiveReceiptRuleSetResult build() {
            return new GetActiveReceiptRuleSetResult(arn, id, ruleSetName);
        }
    }
}
