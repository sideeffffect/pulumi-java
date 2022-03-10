// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTestBaseAccountFileUploadUrlArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTestBaseAccountFileUploadUrlArgs Empty = new GetTestBaseAccountFileUploadUrlArgs();

    /**
     * The custom file name of the uploaded blob.
     * 
     */
    @InputImport(name="blobName")
      private final @Nullable String blobName;

    public Optional<String> getBlobName() {
        return this.blobName == null ? Optional.empty() : Optional.ofNullable(this.blobName);
    }

    /**
     * The name of the resource group that contains the resource.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The resource name of the Test Base Account.
     * 
     */
    @InputImport(name="testBaseAccountName", required=true)
      private final String testBaseAccountName;

    public String getTestBaseAccountName() {
        return this.testBaseAccountName;
    }

    public GetTestBaseAccountFileUploadUrlArgs(
        @Nullable String blobName,
        String resourceGroupName,
        String testBaseAccountName) {
        this.blobName = blobName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.testBaseAccountName = Objects.requireNonNull(testBaseAccountName, "expected parameter 'testBaseAccountName' to be non-null");
    }

    private GetTestBaseAccountFileUploadUrlArgs() {
        this.blobName = null;
        this.resourceGroupName = null;
        this.testBaseAccountName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTestBaseAccountFileUploadUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String blobName;
        private String resourceGroupName;
        private String testBaseAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTestBaseAccountFileUploadUrlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobName = defaults.blobName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.testBaseAccountName = defaults.testBaseAccountName;
        }

        public Builder blobName(@Nullable String blobName) {
            this.blobName = blobName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder testBaseAccountName(String testBaseAccountName) {
            this.testBaseAccountName = Objects.requireNonNull(testBaseAccountName);
            return this;
        }
        public GetTestBaseAccountFileUploadUrlArgs build() {
            return new GetTestBaseAccountFileUploadUrlArgs(blobName, resourceGroupName, testBaseAccountName);
        }
    }
}
