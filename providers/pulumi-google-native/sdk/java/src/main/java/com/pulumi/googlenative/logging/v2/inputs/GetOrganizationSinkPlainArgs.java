// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.logging.v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationSinkPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrganizationSinkPlainArgs Empty = new GetOrganizationSinkPlainArgs();

    @Import(name="organizationId", required=true)
    private String organizationId;

    public String organizationId() {
        return this.organizationId;
    }

    @Import(name="sinkId", required=true)
    private String sinkId;

    public String sinkId() {
        return this.sinkId;
    }

    private GetOrganizationSinkPlainArgs() {}

    private GetOrganizationSinkPlainArgs(GetOrganizationSinkPlainArgs $) {
        this.organizationId = $.organizationId;
        this.sinkId = $.sinkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrganizationSinkPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrganizationSinkPlainArgs $;

        public Builder() {
            $ = new GetOrganizationSinkPlainArgs();
        }

        public Builder(GetOrganizationSinkPlainArgs defaults) {
            $ = new GetOrganizationSinkPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder sinkId(String sinkId) {
            $.sinkId = sinkId;
            return this;
        }

        public GetOrganizationSinkPlainArgs build() {
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            $.sinkId = Objects.requireNonNull($.sinkId, "expected parameter 'sinkId' to be non-null");
            return $;
        }
    }

}
