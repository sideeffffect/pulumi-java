// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.assuredworkloads.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWorkloadPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkloadPlainArgs Empty = new GetWorkloadPlainArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="organizationId", required=true)
    private String organizationId;

    public String organizationId() {
        return this.organizationId;
    }

    @Import(name="workloadId", required=true)
    private String workloadId;

    public String workloadId() {
        return this.workloadId;
    }

    private GetWorkloadPlainArgs() {}

    private GetWorkloadPlainArgs(GetWorkloadPlainArgs $) {
        this.location = $.location;
        this.organizationId = $.organizationId;
        this.workloadId = $.workloadId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkloadPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkloadPlainArgs $;

        public Builder() {
            $ = new GetWorkloadPlainArgs();
        }

        public Builder(GetWorkloadPlainArgs defaults) {
            $ = new GetWorkloadPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder workloadId(String workloadId) {
            $.workloadId = workloadId;
            return this;
        }

        public GetWorkloadPlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            $.workloadId = Objects.requireNonNull($.workloadId, "expected parameter 'workloadId' to be non-null");
            return $;
        }
    }

}
