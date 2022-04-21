// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.aps.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A key-value pair to associate with a resource.
 * 
 */
public final class RuleGroupsNamespaceTag extends com.pulumi.resources.InvokeArgs {

    public static final RuleGroupsNamespaceTag Empty = new RuleGroupsNamespaceTag();

    /**
     * The key name of the tag. You can specify a value that is 1 to 128 Unicode characters in length and cannot be prefixed with aws:. You can use any of the following characters: the set of Unicode letters, digits, whitespace, _, ., /, =, +, and -.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    public String key() {
        return this.key;
    }

    /**
     * The value for the tag. You can specify a value that is 0 to 256 Unicode characters in length and cannot be prefixed with aws:. You can use any of the following characters: the set of Unicode letters, digits, whitespace, _, ., /, =, +, and -.
     * 
     */
    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private RuleGroupsNamespaceTag() {}

    private RuleGroupsNamespaceTag(RuleGroupsNamespaceTag $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupsNamespaceTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupsNamespaceTag $;

        public Builder() {
            $ = new RuleGroupsNamespaceTag();
        }

        public Builder(RuleGroupsNamespaceTag defaults) {
            $ = new RuleGroupsNamespaceTag(Objects.requireNonNull(defaults));
        }

        public Builder key(String key) {
            $.key = key;
            return this;
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public RuleGroupsNamespaceTag build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
