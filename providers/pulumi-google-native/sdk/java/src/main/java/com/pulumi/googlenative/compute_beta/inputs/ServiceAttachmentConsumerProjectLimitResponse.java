// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ServiceAttachmentConsumerProjectLimitResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServiceAttachmentConsumerProjectLimitResponse Empty = new ServiceAttachmentConsumerProjectLimitResponse();

    /**
     * The value of the limit to set.
     * 
     */
    @Import(name="connectionLimit", required=true)
    private Integer connectionLimit;

    public Integer connectionLimit() {
        return this.connectionLimit;
    }

    /**
     * The project id or number for the project to set the limit for.
     * 
     */
    @Import(name="projectIdOrNum", required=true)
    private String projectIdOrNum;

    public String projectIdOrNum() {
        return this.projectIdOrNum;
    }

    private ServiceAttachmentConsumerProjectLimitResponse() {}

    private ServiceAttachmentConsumerProjectLimitResponse(ServiceAttachmentConsumerProjectLimitResponse $) {
        this.connectionLimit = $.connectionLimit;
        this.projectIdOrNum = $.projectIdOrNum;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceAttachmentConsumerProjectLimitResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceAttachmentConsumerProjectLimitResponse $;

        public Builder() {
            $ = new ServiceAttachmentConsumerProjectLimitResponse();
        }

        public Builder(ServiceAttachmentConsumerProjectLimitResponse defaults) {
            $ = new ServiceAttachmentConsumerProjectLimitResponse(Objects.requireNonNull(defaults));
        }

        public Builder connectionLimit(Integer connectionLimit) {
            $.connectionLimit = connectionLimit;
            return this;
        }

        public Builder projectIdOrNum(String projectIdOrNum) {
            $.projectIdOrNum = projectIdOrNum;
            return this;
        }

        public ServiceAttachmentConsumerProjectLimitResponse build() {
            $.connectionLimit = Objects.requireNonNull($.connectionLimit, "expected parameter 'connectionLimit' to be non-null");
            $.projectIdOrNum = Objects.requireNonNull($.projectIdOrNum, "expected parameter 'projectIdOrNum' to be non-null");
            return $;
        }
    }

}
