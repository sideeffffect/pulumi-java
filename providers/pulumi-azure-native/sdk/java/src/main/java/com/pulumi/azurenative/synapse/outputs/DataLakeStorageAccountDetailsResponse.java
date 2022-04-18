// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataLakeStorageAccountDetailsResponse {
    /**
     * Account URL
     * 
     */
    private final @Nullable String accountUrl;
    /**
     * Filesystem name
     * 
     */
    private final @Nullable String filesystem;

    @CustomType.Constructor
    private DataLakeStorageAccountDetailsResponse(
        @CustomType.Parameter("accountUrl") @Nullable String accountUrl,
        @CustomType.Parameter("filesystem") @Nullable String filesystem) {
        this.accountUrl = accountUrl;
        this.filesystem = filesystem;
    }

    /**
     * Account URL
     * 
    */
    public Optional<String> accountUrl() {
        return Optional.ofNullable(this.accountUrl);
    }
    /**
     * Filesystem name
     * 
    */
    public Optional<String> filesystem() {
        return Optional.ofNullable(this.filesystem);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataLakeStorageAccountDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accountUrl;
        private @Nullable String filesystem;

        public Builder() {
    	      // Empty
        }

        public Builder(DataLakeStorageAccountDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountUrl = defaults.accountUrl;
    	      this.filesystem = defaults.filesystem;
        }

        public Builder accountUrl(@Nullable String accountUrl) {
            this.accountUrl = accountUrl;
            return this;
        }
        public Builder filesystem(@Nullable String filesystem) {
            this.filesystem = filesystem;
            return this;
        }        public DataLakeStorageAccountDetailsResponse build() {
            return new DataLakeStorageAccountDetailsResponse(accountUrl, filesystem);
        }
    }
}
