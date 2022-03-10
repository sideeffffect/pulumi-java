// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleActionCountCustomRequestHandlingInsertHeaderGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleActionCountCustomRequestHandlingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleActionCountCustomRequestHandlingGetArgs Empty = new WebAclRuleActionCountCustomRequestHandlingGetArgs();

    /**
     * The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    @InputImport(name="insertHeaders", required=true)
      private final Input<List<WebAclRuleActionCountCustomRequestHandlingInsertHeaderGetArgs>> insertHeaders;

    public Input<List<WebAclRuleActionCountCustomRequestHandlingInsertHeaderGetArgs>> getInsertHeaders() {
        return this.insertHeaders;
    }

    public WebAclRuleActionCountCustomRequestHandlingGetArgs(Input<List<WebAclRuleActionCountCustomRequestHandlingInsertHeaderGetArgs>> insertHeaders) {
        this.insertHeaders = Objects.requireNonNull(insertHeaders, "expected parameter 'insertHeaders' to be non-null");
    }

    private WebAclRuleActionCountCustomRequestHandlingGetArgs() {
        this.insertHeaders = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleActionCountCustomRequestHandlingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<WebAclRuleActionCountCustomRequestHandlingInsertHeaderGetArgs>> insertHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleActionCountCustomRequestHandlingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insertHeaders = defaults.insertHeaders;
        }

        public Builder insertHeaders(Input<List<WebAclRuleActionCountCustomRequestHandlingInsertHeaderGetArgs>> insertHeaders) {
            this.insertHeaders = Objects.requireNonNull(insertHeaders);
            return this;
        }

        public Builder insertHeaders(List<WebAclRuleActionCountCustomRequestHandlingInsertHeaderGetArgs> insertHeaders) {
            this.insertHeaders = Input.of(Objects.requireNonNull(insertHeaders));
            return this;
        }
        public WebAclRuleActionCountCustomRequestHandlingGetArgs build() {
            return new WebAclRuleActionCountCustomRequestHandlingGetArgs(insertHeaders);
        }
    }
}
