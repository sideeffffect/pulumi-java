// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.inputs;

import com.pulumi.awsnative.databrew.inputs.DatasetCsvOptionsArgs;
import com.pulumi.awsnative.databrew.inputs.DatasetExcelOptionsArgs;
import com.pulumi.awsnative.databrew.inputs.DatasetJsonOptionsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Format options for dataset
 * 
 */
public final class DatasetFormatOptionsArgs extends ResourceArgs {

    public static final DatasetFormatOptionsArgs Empty = new DatasetFormatOptionsArgs();

    @Import(name="csv")
    private @Nullable Output<DatasetCsvOptionsArgs> csv;

    public Optional<Output<DatasetCsvOptionsArgs>> csv() {
        return Optional.ofNullable(this.csv);
    }

    @Import(name="excel")
    private @Nullable Output<DatasetExcelOptionsArgs> excel;

    public Optional<Output<DatasetExcelOptionsArgs>> excel() {
        return Optional.ofNullable(this.excel);
    }

    @Import(name="json")
    private @Nullable Output<DatasetJsonOptionsArgs> json;

    public Optional<Output<DatasetJsonOptionsArgs>> json() {
        return Optional.ofNullable(this.json);
    }

    private DatasetFormatOptionsArgs() {}

    private DatasetFormatOptionsArgs(DatasetFormatOptionsArgs $) {
        this.csv = $.csv;
        this.excel = $.excel;
        this.json = $.json;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetFormatOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetFormatOptionsArgs $;

        public Builder() {
            $ = new DatasetFormatOptionsArgs();
        }

        public Builder(DatasetFormatOptionsArgs defaults) {
            $ = new DatasetFormatOptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder csv(@Nullable Output<DatasetCsvOptionsArgs> csv) {
            $.csv = csv;
            return this;
        }

        public Builder csv(DatasetCsvOptionsArgs csv) {
            return csv(Output.of(csv));
        }

        public Builder excel(@Nullable Output<DatasetExcelOptionsArgs> excel) {
            $.excel = excel;
            return this;
        }

        public Builder excel(DatasetExcelOptionsArgs excel) {
            return excel(Output.of(excel));
        }

        public Builder json(@Nullable Output<DatasetJsonOptionsArgs> json) {
            $.json = json;
            return this;
        }

        public Builder json(DatasetJsonOptionsArgs json) {
            return json(Output.of(json));
        }

        public DatasetFormatOptionsArgs build() {
            return $;
        }
    }

}
