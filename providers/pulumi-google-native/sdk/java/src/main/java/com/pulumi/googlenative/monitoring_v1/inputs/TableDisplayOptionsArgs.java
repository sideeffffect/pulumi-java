// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Table display options that can be reused.
 * 
 */
public final class TableDisplayOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final TableDisplayOptionsArgs Empty = new TableDisplayOptionsArgs();

    /**
     * Optional. Columns to display in the table. Leave empty to display all available columns. Note: This field is for future features and is not currently used.
     * 
     */
    @Import(name="shownColumns")
    private @Nullable Output<List<String>> shownColumns;

    public Optional<Output<List<String>>> shownColumns() {
        return Optional.ofNullable(this.shownColumns);
    }

    private TableDisplayOptionsArgs() {}

    private TableDisplayOptionsArgs(TableDisplayOptionsArgs $) {
        this.shownColumns = $.shownColumns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableDisplayOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableDisplayOptionsArgs $;

        public Builder() {
            $ = new TableDisplayOptionsArgs();
        }

        public Builder(TableDisplayOptionsArgs defaults) {
            $ = new TableDisplayOptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder shownColumns(@Nullable Output<List<String>> shownColumns) {
            $.shownColumns = shownColumns;
            return this;
        }

        public Builder shownColumns(List<String> shownColumns) {
            return shownColumns(Output.of(shownColumns));
        }

        public Builder shownColumns(String... shownColumns) {
            return shownColumns(List.of(shownColumns));
        }

        public TableDisplayOptionsArgs build() {
            return $;
        }
    }

}
