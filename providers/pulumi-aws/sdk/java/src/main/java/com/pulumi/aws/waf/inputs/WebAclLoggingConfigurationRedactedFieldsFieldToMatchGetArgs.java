// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.waf.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclLoggingConfigurationRedactedFieldsFieldToMatchGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclLoggingConfigurationRedactedFieldsFieldToMatchGetArgs Empty = new WebAclLoggingConfigurationRedactedFieldsFieldToMatchGetArgs();

    /**
     * When the value of `type` is `HEADER`, enter the name of the header that you want the WAF to search, for example, `User-Agent` or `Referer`. If the value of `type` is any other value, omit `data`.
     * 
     */
    @Import(name="data")
    private @Nullable Output<String> data;

    public Optional<Output<String>> data() {
        return Optional.ofNullable(this.data);
    }

    /**
     * The rule type, either `REGULAR`, as defined by [Rule](http://docs.aws.amazon.com/waf/latest/APIReference/API_Rule.html), `RATE_BASED`, as defined by [RateBasedRule](http://docs.aws.amazon.com/waf/latest/APIReference/API_RateBasedRule.html), or `GROUP`, as defined by [RuleGroup](https://docs.aws.amazon.com/waf/latest/APIReference/API_RuleGroup.html). The default is REGULAR. If you add a RATE_BASED rule, you need to set `type` as `RATE_BASED`. If you add a GROUP rule, you need to set `type` as `GROUP`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private WebAclLoggingConfigurationRedactedFieldsFieldToMatchGetArgs() {}

    private WebAclLoggingConfigurationRedactedFieldsFieldToMatchGetArgs(WebAclLoggingConfigurationRedactedFieldsFieldToMatchGetArgs $) {
        this.data = $.data;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclLoggingConfigurationRedactedFieldsFieldToMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclLoggingConfigurationRedactedFieldsFieldToMatchGetArgs $;

        public Builder() {
            $ = new WebAclLoggingConfigurationRedactedFieldsFieldToMatchGetArgs();
        }

        public Builder(WebAclLoggingConfigurationRedactedFieldsFieldToMatchGetArgs defaults) {
            $ = new WebAclLoggingConfigurationRedactedFieldsFieldToMatchGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder data(@Nullable Output<String> data) {
            $.data = data;
            return this;
        }

        public Builder data(String data) {
            return data(Output.of(data));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public WebAclLoggingConfigurationRedactedFieldsFieldToMatchGetArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
