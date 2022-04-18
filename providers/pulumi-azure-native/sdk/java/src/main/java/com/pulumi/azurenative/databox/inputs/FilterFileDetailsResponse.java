// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Details of the filter files to be used for data transfer.
 * 
 */
public final class FilterFileDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final FilterFileDetailsResponse Empty = new FilterFileDetailsResponse();

    /**
     * Path of the file that contains the details of all items to transfer.
     * 
     */
    @Import(name="filterFilePath", required=true)
      private final String filterFilePath;

    public String filterFilePath() {
        return this.filterFilePath;
    }

    /**
     * Type of the filter file.
     * 
     */
    @Import(name="filterFileType", required=true)
      private final String filterFileType;

    public String filterFileType() {
        return this.filterFileType;
    }

    public FilterFileDetailsResponse(
        String filterFilePath,
        String filterFileType) {
        this.filterFilePath = Objects.requireNonNull(filterFilePath, "expected parameter 'filterFilePath' to be non-null");
        this.filterFileType = Objects.requireNonNull(filterFileType, "expected parameter 'filterFileType' to be non-null");
    }

    private FilterFileDetailsResponse() {
        this.filterFilePath = null;
        this.filterFileType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterFileDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String filterFilePath;
        private String filterFileType;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterFileDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterFilePath = defaults.filterFilePath;
    	      this.filterFileType = defaults.filterFileType;
        }

        public Builder filterFilePath(String filterFilePath) {
            this.filterFilePath = Objects.requireNonNull(filterFilePath);
            return this;
        }
        public Builder filterFileType(String filterFileType) {
            this.filterFileType = Objects.requireNonNull(filterFileType);
            return this;
        }        public FilterFileDetailsResponse build() {
            return new FilterFileDetailsResponse(filterFilePath, filterFileType);
        }
    }
}
