// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.applicationloadbalancing.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ListenerRuleConditionHttpHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerRuleConditionHttpHeaderArgs Empty = new ListenerRuleConditionHttpHeaderArgs();

    /**
     * Name of HTTP header to search. The maximum size is 40 characters. Comparison is case insensitive. Only RFC7240 characters are supported. Wildcards are not supported. You cannot use HTTP header condition to specify the host header, use a `host-header` condition instead.
     * 
     */
    @Import(name="httpHeaderName", required=true)
    private Output<String> httpHeaderName;

    public Output<String> httpHeaderName() {
        return this.httpHeaderName;
    }

    /**
     * List of header value patterns to match. Maximum size of each pattern is 128 characters. Comparison is case insensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). If the same header appears multiple times in the request they will be searched in order until a match is found. Only one pattern needs to match for the condition to be satisfied. To require that all of the strings are a match, create one condition block per string.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    public Output<List<String>> values() {
        return this.values;
    }

    private ListenerRuleConditionHttpHeaderArgs() {}

    private ListenerRuleConditionHttpHeaderArgs(ListenerRuleConditionHttpHeaderArgs $) {
        this.httpHeaderName = $.httpHeaderName;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerRuleConditionHttpHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerRuleConditionHttpHeaderArgs $;

        public Builder() {
            $ = new ListenerRuleConditionHttpHeaderArgs();
        }

        public Builder(ListenerRuleConditionHttpHeaderArgs defaults) {
            $ = new ListenerRuleConditionHttpHeaderArgs(Objects.requireNonNull(defaults));
        }

        public Builder httpHeaderName(Output<String> httpHeaderName) {
            $.httpHeaderName = httpHeaderName;
            return this;
        }

        public Builder httpHeaderName(String httpHeaderName) {
            return httpHeaderName(Output.of(httpHeaderName));
        }

        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public ListenerRuleConditionHttpHeaderArgs build() {
            $.httpHeaderName = Objects.requireNonNull($.httpHeaderName, "expected parameter 'httpHeaderName' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
