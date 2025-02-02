// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.identitystore.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetUserFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetUserFilter Empty = new GetUserFilter();

    /**
     * The attribute path that is used to specify which attribute name to search. Currently, `UserName` is the only valid attribute path.
     * 
     */
    @Import(name="attributePath", required=true)
    private String attributePath;

    /**
     * @return The attribute path that is used to specify which attribute name to search. Currently, `UserName` is the only valid attribute path.
     * 
     */
    public String attributePath() {
        return this.attributePath;
    }

    /**
     * The value for an attribute.
     * 
     */
    @Import(name="attributeValue", required=true)
    private String attributeValue;

    /**
     * @return The value for an attribute.
     * 
     */
    public String attributeValue() {
        return this.attributeValue;
    }

    private GetUserFilter() {}

    private GetUserFilter(GetUserFilter $) {
        this.attributePath = $.attributePath;
        this.attributeValue = $.attributeValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserFilter $;

        public Builder() {
            $ = new GetUserFilter();
        }

        public Builder(GetUserFilter defaults) {
            $ = new GetUserFilter(Objects.requireNonNull(defaults));
        }

        /**
         * @param attributePath The attribute path that is used to specify which attribute name to search. Currently, `UserName` is the only valid attribute path.
         * 
         * @return builder
         * 
         */
        public Builder attributePath(String attributePath) {
            $.attributePath = attributePath;
            return this;
        }

        /**
         * @param attributeValue The value for an attribute.
         * 
         * @return builder
         * 
         */
        public Builder attributeValue(String attributeValue) {
            $.attributeValue = attributeValue;
            return this;
        }

        public GetUserFilter build() {
            $.attributePath = Objects.requireNonNull($.attributePath, "expected parameter 'attributePath' to be non-null");
            $.attributeValue = Objects.requireNonNull($.attributeValue, "expected parameter 'attributeValue' to be non-null");
            return $;
        }
    }

}
