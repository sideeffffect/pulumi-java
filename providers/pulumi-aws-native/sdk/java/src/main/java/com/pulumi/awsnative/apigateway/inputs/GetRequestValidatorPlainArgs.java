// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRequestValidatorPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRequestValidatorPlainArgs Empty = new GetRequestValidatorPlainArgs();

    /**
     * ID of the request validator.
     * 
     */
    @Import(name="requestValidatorId", required=true)
    private String requestValidatorId;

    /**
     * @return ID of the request validator.
     * 
     */
    public String requestValidatorId() {
        return this.requestValidatorId;
    }

    /**
     * The identifier of the targeted API entity.
     * 
     */
    @Import(name="restApiId", required=true)
    private String restApiId;

    /**
     * @return The identifier of the targeted API entity.
     * 
     */
    public String restApiId() {
        return this.restApiId;
    }

    private GetRequestValidatorPlainArgs() {}

    private GetRequestValidatorPlainArgs(GetRequestValidatorPlainArgs $) {
        this.requestValidatorId = $.requestValidatorId;
        this.restApiId = $.restApiId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRequestValidatorPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRequestValidatorPlainArgs $;

        public Builder() {
            $ = new GetRequestValidatorPlainArgs();
        }

        public Builder(GetRequestValidatorPlainArgs defaults) {
            $ = new GetRequestValidatorPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param requestValidatorId ID of the request validator.
         * 
         * @return builder
         * 
         */
        public Builder requestValidatorId(String requestValidatorId) {
            $.requestValidatorId = requestValidatorId;
            return this;
        }

        /**
         * @param restApiId The identifier of the targeted API entity.
         * 
         * @return builder
         * 
         */
        public Builder restApiId(String restApiId) {
            $.restApiId = restApiId;
            return this;
        }

        public GetRequestValidatorPlainArgs build() {
            $.requestValidatorId = Objects.requireNonNull($.requestValidatorId, "expected parameter 'requestValidatorId' to be non-null");
            $.restApiId = Objects.requireNonNull($.restApiId, "expected parameter 'restApiId' to be non-null");
            return $;
        }
    }

}
