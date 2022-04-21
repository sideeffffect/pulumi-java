// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTargetServerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTargetServerArgs Empty = new GetTargetServerArgs();

    @Import(name="environmentId", required=true)
    private String environmentId;

    public String environmentId() {
        return this.environmentId;
    }

    @Import(name="organizationId", required=true)
    private String organizationId;

    public String organizationId() {
        return this.organizationId;
    }

    @Import(name="targetserverId", required=true)
    private String targetserverId;

    public String targetserverId() {
        return this.targetserverId;
    }

    private GetTargetServerArgs() {}

    private GetTargetServerArgs(GetTargetServerArgs $) {
        this.environmentId = $.environmentId;
        this.organizationId = $.organizationId;
        this.targetserverId = $.targetserverId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTargetServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTargetServerArgs $;

        public Builder() {
            $ = new GetTargetServerArgs();
        }

        public Builder(GetTargetServerArgs defaults) {
            $ = new GetTargetServerArgs(Objects.requireNonNull(defaults));
        }

        public Builder environmentId(String environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder targetserverId(String targetserverId) {
            $.targetserverId = targetserverId;
            return this;
        }

        public GetTargetServerArgs build() {
            $.environmentId = Objects.requireNonNull($.environmentId, "expected parameter 'environmentId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            $.targetserverId = Objects.requireNonNull($.targetserverId, "expected parameter 'targetserverId' to be non-null");
            return $;
        }
    }

}
