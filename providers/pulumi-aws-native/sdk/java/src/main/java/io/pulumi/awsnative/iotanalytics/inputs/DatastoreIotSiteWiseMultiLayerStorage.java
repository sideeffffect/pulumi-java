// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.awsnative.iotanalytics.inputs.DatastoreCustomerManagedS3Storage;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatastoreIotSiteWiseMultiLayerStorage extends io.pulumi.resources.InvokeArgs {

    public static final DatastoreIotSiteWiseMultiLayerStorage Empty = new DatastoreIotSiteWiseMultiLayerStorage();

    @InputImport(name="customerManagedS3Storage")
      private final @Nullable DatastoreCustomerManagedS3Storage customerManagedS3Storage;

    public Optional<DatastoreCustomerManagedS3Storage> getCustomerManagedS3Storage() {
        return this.customerManagedS3Storage == null ? Optional.empty() : Optional.ofNullable(this.customerManagedS3Storage);
    }

    public DatastoreIotSiteWiseMultiLayerStorage(@Nullable DatastoreCustomerManagedS3Storage customerManagedS3Storage) {
        this.customerManagedS3Storage = customerManagedS3Storage;
    }

    private DatastoreIotSiteWiseMultiLayerStorage() {
        this.customerManagedS3Storage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatastoreIotSiteWiseMultiLayerStorage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatastoreCustomerManagedS3Storage customerManagedS3Storage;

        public Builder() {
    	      // Empty
        }

        public Builder(DatastoreIotSiteWiseMultiLayerStorage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerManagedS3Storage = defaults.customerManagedS3Storage;
        }

        public Builder customerManagedS3Storage(@Nullable DatastoreCustomerManagedS3Storage customerManagedS3Storage) {
            this.customerManagedS3Storage = customerManagedS3Storage;
            return this;
        }
        public DatastoreIotSiteWiseMultiLayerStorage build() {
            return new DatastoreIotSiteWiseMultiLayerStorage(customerManagedS3Storage);
        }
    }
}
