// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.azurenative.streamanalytics.outputs.StorageAccountResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BlobReferenceInputDataSourceResponse {
    /**
     * The name of a container within the associated Storage account. This container contains either the blob(s) to be read from or written to. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String container;
    /**
     * The date format. Wherever {date} appears in pathPattern, the value of this property is used as the date format instead.
     * 
     */
    private final @Nullable String dateFormat;
    /**
     * The blob path pattern. Not a regular expression. It represents a pattern against which blob names will be matched to determine whether or not they should be included as input or output to the job. See https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-input or https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for a more detailed explanation and example.
     * 
     */
    private final @Nullable String pathPattern;
    /**
     * A list of one or more Azure Storage accounts. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable List<StorageAccountResponse> storageAccounts;
    /**
     * The time format. Wherever {time} appears in pathPattern, the value of this property is used as the time format instead.
     * 
     */
    private final @Nullable String timeFormat;
    /**
     * Indicates the type of input data source containing reference data. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.Storage/Blob'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"container","dateFormat","pathPattern","storageAccounts","timeFormat","type"})
    private BlobReferenceInputDataSourceResponse(
        @Nullable String container,
        @Nullable String dateFormat,
        @Nullable String pathPattern,
        @Nullable List<StorageAccountResponse> storageAccounts,
        @Nullable String timeFormat,
        String type) {
        this.container = container;
        this.dateFormat = dateFormat;
        this.pathPattern = pathPattern;
        this.storageAccounts = storageAccounts;
        this.timeFormat = timeFormat;
        this.type = type;
    }

    /**
     * The name of a container within the associated Storage account. This container contains either the blob(s) to be read from or written to. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> getContainer() {
        return Optional.ofNullable(this.container);
    }
    /**
     * The date format. Wherever {date} appears in pathPattern, the value of this property is used as the date format instead.
     * 
    */
    public Optional<String> getDateFormat() {
        return Optional.ofNullable(this.dateFormat);
    }
    /**
     * The blob path pattern. Not a regular expression. It represents a pattern against which blob names will be matched to determine whether or not they should be included as input or output to the job. See https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-input or https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for a more detailed explanation and example.
     * 
    */
    public Optional<String> getPathPattern() {
        return Optional.ofNullable(this.pathPattern);
    }
    /**
     * A list of one or more Azure Storage accounts. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public List<StorageAccountResponse> getStorageAccounts() {
        return this.storageAccounts == null ? List.of() : this.storageAccounts;
    }
    /**
     * The time format. Wherever {time} appears in pathPattern, the value of this property is used as the time format instead.
     * 
    */
    public Optional<String> getTimeFormat() {
        return Optional.ofNullable(this.timeFormat);
    }
    /**
     * Indicates the type of input data source containing reference data. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.Storage/Blob'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobReferenceInputDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String container;
        private @Nullable String dateFormat;
        private @Nullable String pathPattern;
        private @Nullable List<StorageAccountResponse> storageAccounts;
        private @Nullable String timeFormat;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobReferenceInputDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.dateFormat = defaults.dateFormat;
    	      this.pathPattern = defaults.pathPattern;
    	      this.storageAccounts = defaults.storageAccounts;
    	      this.timeFormat = defaults.timeFormat;
    	      this.type = defaults.type;
        }

        public Builder setContainer(@Nullable String container) {
            this.container = container;
            return this;
        }

        public Builder setDateFormat(@Nullable String dateFormat) {
            this.dateFormat = dateFormat;
            return this;
        }

        public Builder setPathPattern(@Nullable String pathPattern) {
            this.pathPattern = pathPattern;
            return this;
        }

        public Builder setStorageAccounts(@Nullable List<StorageAccountResponse> storageAccounts) {
            this.storageAccounts = storageAccounts;
            return this;
        }

        public Builder setTimeFormat(@Nullable String timeFormat) {
            this.timeFormat = timeFormat;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public BlobReferenceInputDataSourceResponse build() {
            return new BlobReferenceInputDataSourceResponse(container, dateFormat, pathPattern, storageAccounts, timeFormat, type);
        }
    }
}
