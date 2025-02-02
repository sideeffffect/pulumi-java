// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.securitycenter_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationBigQueryExportPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrganizationBigQueryExportPlainArgs Empty = new GetOrganizationBigQueryExportPlainArgs();

    @Import(name="bigQueryExportId", required=true)
    private String bigQueryExportId;

    public String bigQueryExportId() {
        return this.bigQueryExportId;
    }

    @Import(name="organizationId", required=true)
    private String organizationId;

    public String organizationId() {
        return this.organizationId;
    }

    private GetOrganizationBigQueryExportPlainArgs() {}

    private GetOrganizationBigQueryExportPlainArgs(GetOrganizationBigQueryExportPlainArgs $) {
        this.bigQueryExportId = $.bigQueryExportId;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrganizationBigQueryExportPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrganizationBigQueryExportPlainArgs $;

        public Builder() {
            $ = new GetOrganizationBigQueryExportPlainArgs();
        }

        public Builder(GetOrganizationBigQueryExportPlainArgs defaults) {
            $ = new GetOrganizationBigQueryExportPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder bigQueryExportId(String bigQueryExportId) {
            $.bigQueryExportId = bigQueryExportId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public GetOrganizationBigQueryExportPlainArgs build() {
            $.bigQueryExportId = Objects.requireNonNull($.bigQueryExportId, "expected parameter 'bigQueryExportId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}
