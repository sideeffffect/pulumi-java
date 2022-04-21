// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.testbase.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPackageDownloadURLArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPackageDownloadURLArgs Empty = new GetPackageDownloadURLArgs();

    /**
     * The resource name of the Test Base Package.
     * 
     */
    @Import(name="packageName", required=true)
    private String packageName;

    public String packageName() {
        return this.packageName;
    }

    /**
     * The name of the resource group that contains the resource.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The resource name of the Test Base Account.
     * 
     */
    @Import(name="testBaseAccountName", required=true)
    private String testBaseAccountName;

    public String testBaseAccountName() {
        return this.testBaseAccountName;
    }

    private GetPackageDownloadURLArgs() {}

    private GetPackageDownloadURLArgs(GetPackageDownloadURLArgs $) {
        this.packageName = $.packageName;
        this.resourceGroupName = $.resourceGroupName;
        this.testBaseAccountName = $.testBaseAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPackageDownloadURLArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPackageDownloadURLArgs $;

        public Builder() {
            $ = new GetPackageDownloadURLArgs();
        }

        public Builder(GetPackageDownloadURLArgs defaults) {
            $ = new GetPackageDownloadURLArgs(Objects.requireNonNull(defaults));
        }

        public Builder packageName(String packageName) {
            $.packageName = packageName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder testBaseAccountName(String testBaseAccountName) {
            $.testBaseAccountName = testBaseAccountName;
            return this;
        }

        public GetPackageDownloadURLArgs build() {
            $.packageName = Objects.requireNonNull($.packageName, "expected parameter 'packageName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.testBaseAccountName = Objects.requireNonNull($.testBaseAccountName, "expected parameter 'testBaseAccountName' to be non-null");
            return $;
        }
    }

}
