// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.securitycenter.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class NotificationConfigStreamingConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationConfigStreamingConfigGetArgs Empty = new NotificationConfigStreamingConfigGetArgs();

    /**
     * Expression that defines the filter to apply across create/update
     * events of assets or findings as specified by the event type. The
     * expression is a list of zero or more restrictions combined via
     * logical operators AND and OR. Parentheses are supported, and OR
     * has higher precedence than AND.
     * Restrictions have the form &lt;field&gt; &lt;operator&gt; &lt;value&gt; and may have
     * a - character in front of them to indicate negation. The fields
     * map to those defined in the corresponding resource.
     * The supported operators are:
     * * = for all value types.
     * * &gt; , &lt;, &gt;=, &lt;= for integer values.
     * * :, meaning substring matching, for strings.
     *   The supported value types are:
     * * string literals in quotes.
     * * integer literals without quotes.
     * * boolean literals true and false without quotes.
     *   See
     *   [Filtering notifications](https://cloud.google.com/security-command-center/docs/how-to-api-filter-notifications)
     *   for information on how to write a filter.
     * 
     */
    @Import(name="filter", required=true)
    private Output<String> filter;

    public Output<String> filter() {
        return this.filter;
    }

    private NotificationConfigStreamingConfigGetArgs() {}

    private NotificationConfigStreamingConfigGetArgs(NotificationConfigStreamingConfigGetArgs $) {
        this.filter = $.filter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationConfigStreamingConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationConfigStreamingConfigGetArgs $;

        public Builder() {
            $ = new NotificationConfigStreamingConfigGetArgs();
        }

        public Builder(NotificationConfigStreamingConfigGetArgs defaults) {
            $ = new NotificationConfigStreamingConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder filter(Output<String> filter) {
            $.filter = filter;
            return this;
        }

        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        public NotificationConfigStreamingConfigGetArgs build() {
            $.filter = Objects.requireNonNull($.filter, "expected parameter 'filter' to be non-null");
            return $;
        }
    }

}
