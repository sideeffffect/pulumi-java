// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.azurenative.databox.enums.FilterFileType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Details of the filter files to be used for data transfer.
 * 
 */
public final class FilterFileDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final FilterFileDetailsArgs Empty = new FilterFileDetailsArgs();

    /**
     * Path of the file that contains the details of all items to transfer.
     * 
     */
    @Import(name="filterFilePath", required=true)
    private Output<String> filterFilePath;

    public Output<String> filterFilePath() {
        return this.filterFilePath;
    }

    /**
     * Type of the filter file.
     * 
     */
    @Import(name="filterFileType", required=true)
    private Output<Either<String,FilterFileType>> filterFileType;

    public Output<Either<String,FilterFileType>> filterFileType() {
        return this.filterFileType;
    }

    private FilterFileDetailsArgs() {}

    private FilterFileDetailsArgs(FilterFileDetailsArgs $) {
        this.filterFilePath = $.filterFilePath;
        this.filterFileType = $.filterFileType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FilterFileDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FilterFileDetailsArgs $;

        public Builder() {
            $ = new FilterFileDetailsArgs();
        }

        public Builder(FilterFileDetailsArgs defaults) {
            $ = new FilterFileDetailsArgs(Objects.requireNonNull(defaults));
        }

        public Builder filterFilePath(Output<String> filterFilePath) {
            $.filterFilePath = filterFilePath;
            return this;
        }

        public Builder filterFilePath(String filterFilePath) {
            return filterFilePath(Output.of(filterFilePath));
        }

        public Builder filterFileType(Output<Either<String,FilterFileType>> filterFileType) {
            $.filterFileType = filterFileType;
            return this;
        }

        public Builder filterFileType(Either<String,FilterFileType> filterFileType) {
            return filterFileType(Output.of(filterFileType));
        }

        public FilterFileDetailsArgs build() {
            $.filterFilePath = Objects.requireNonNull($.filterFilePath, "expected parameter 'filterFilePath' to be non-null");
            $.filterFileType = Objects.requireNonNull($.filterFileType, "expected parameter 'filterFileType' to be non-null");
            return $;
        }
    }

}
