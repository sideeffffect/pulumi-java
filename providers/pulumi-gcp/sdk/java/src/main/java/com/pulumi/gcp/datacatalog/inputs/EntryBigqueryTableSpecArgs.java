// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.datacatalog.inputs.EntryBigqueryTableSpecTableSpecArgs;
import com.pulumi.gcp.datacatalog.inputs.EntryBigqueryTableSpecViewSpecArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EntryBigqueryTableSpecArgs extends ResourceArgs {

    public static final EntryBigqueryTableSpecArgs Empty = new EntryBigqueryTableSpecArgs();

    @Import(name="tableSourceType")
    private @Nullable Output<String> tableSourceType;

    public Optional<Output<String>> tableSourceType() {
        return Optional.ofNullable(this.tableSourceType);
    }

    @Import(name="tableSpecs")
    private @Nullable Output<List<EntryBigqueryTableSpecTableSpecArgs>> tableSpecs;

    public Optional<Output<List<EntryBigqueryTableSpecTableSpecArgs>>> tableSpecs() {
        return Optional.ofNullable(this.tableSpecs);
    }

    @Import(name="viewSpecs")
    private @Nullable Output<List<EntryBigqueryTableSpecViewSpecArgs>> viewSpecs;

    public Optional<Output<List<EntryBigqueryTableSpecViewSpecArgs>>> viewSpecs() {
        return Optional.ofNullable(this.viewSpecs);
    }

    private EntryBigqueryTableSpecArgs() {}

    private EntryBigqueryTableSpecArgs(EntryBigqueryTableSpecArgs $) {
        this.tableSourceType = $.tableSourceType;
        this.tableSpecs = $.tableSpecs;
        this.viewSpecs = $.viewSpecs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EntryBigqueryTableSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EntryBigqueryTableSpecArgs $;

        public Builder() {
            $ = new EntryBigqueryTableSpecArgs();
        }

        public Builder(EntryBigqueryTableSpecArgs defaults) {
            $ = new EntryBigqueryTableSpecArgs(Objects.requireNonNull(defaults));
        }

        public Builder tableSourceType(@Nullable Output<String> tableSourceType) {
            $.tableSourceType = tableSourceType;
            return this;
        }

        public Builder tableSourceType(String tableSourceType) {
            return tableSourceType(Output.of(tableSourceType));
        }

        public Builder tableSpecs(@Nullable Output<List<EntryBigqueryTableSpecTableSpecArgs>> tableSpecs) {
            $.tableSpecs = tableSpecs;
            return this;
        }

        public Builder tableSpecs(List<EntryBigqueryTableSpecTableSpecArgs> tableSpecs) {
            return tableSpecs(Output.of(tableSpecs));
        }

        public Builder tableSpecs(EntryBigqueryTableSpecTableSpecArgs... tableSpecs) {
            return tableSpecs(List.of(tableSpecs));
        }

        public Builder viewSpecs(@Nullable Output<List<EntryBigqueryTableSpecViewSpecArgs>> viewSpecs) {
            $.viewSpecs = viewSpecs;
            return this;
        }

        public Builder viewSpecs(List<EntryBigqueryTableSpecViewSpecArgs> viewSpecs) {
            return viewSpecs(Output.of(viewSpecs));
        }

        public Builder viewSpecs(EntryBigqueryTableSpecViewSpecArgs... viewSpecs) {
            return viewSpecs(List.of(viewSpecs));
        }

        public EntryBigqueryTableSpecArgs build() {
            return $;
        }
    }

}
