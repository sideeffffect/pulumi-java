// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.awsnative.quicksight.inputs.DashboardAdHocFilteringOptionArgs;
import com.pulumi.awsnative.quicksight.inputs.DashboardExportToCSVOptionArgs;
import com.pulumi.awsnative.quicksight.inputs.DashboardSheetControlsOptionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * &lt;p&gt;Dashboard publish options.&lt;/p&gt;
 * 
 */
public final class DashboardPublishOptionsArgs extends ResourceArgs {

    public static final DashboardPublishOptionsArgs Empty = new DashboardPublishOptionsArgs();

    @Import(name="adHocFilteringOption")
    private @Nullable Output<DashboardAdHocFilteringOptionArgs> adHocFilteringOption;

    public Optional<Output<DashboardAdHocFilteringOptionArgs>> adHocFilteringOption() {
        return Optional.ofNullable(this.adHocFilteringOption);
    }

    @Import(name="exportToCSVOption")
    private @Nullable Output<DashboardExportToCSVOptionArgs> exportToCSVOption;

    public Optional<Output<DashboardExportToCSVOptionArgs>> exportToCSVOption() {
        return Optional.ofNullable(this.exportToCSVOption);
    }

    @Import(name="sheetControlsOption")
    private @Nullable Output<DashboardSheetControlsOptionArgs> sheetControlsOption;

    public Optional<Output<DashboardSheetControlsOptionArgs>> sheetControlsOption() {
        return Optional.ofNullable(this.sheetControlsOption);
    }

    private DashboardPublishOptionsArgs() {}

    private DashboardPublishOptionsArgs(DashboardPublishOptionsArgs $) {
        this.adHocFilteringOption = $.adHocFilteringOption;
        this.exportToCSVOption = $.exportToCSVOption;
        this.sheetControlsOption = $.sheetControlsOption;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardPublishOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardPublishOptionsArgs $;

        public Builder() {
            $ = new DashboardPublishOptionsArgs();
        }

        public Builder(DashboardPublishOptionsArgs defaults) {
            $ = new DashboardPublishOptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder adHocFilteringOption(@Nullable Output<DashboardAdHocFilteringOptionArgs> adHocFilteringOption) {
            $.adHocFilteringOption = adHocFilteringOption;
            return this;
        }

        public Builder adHocFilteringOption(DashboardAdHocFilteringOptionArgs adHocFilteringOption) {
            return adHocFilteringOption(Output.of(adHocFilteringOption));
        }

        public Builder exportToCSVOption(@Nullable Output<DashboardExportToCSVOptionArgs> exportToCSVOption) {
            $.exportToCSVOption = exportToCSVOption;
            return this;
        }

        public Builder exportToCSVOption(DashboardExportToCSVOptionArgs exportToCSVOption) {
            return exportToCSVOption(Output.of(exportToCSVOption));
        }

        public Builder sheetControlsOption(@Nullable Output<DashboardSheetControlsOptionArgs> sheetControlsOption) {
            $.sheetControlsOption = sheetControlsOption;
            return this;
        }

        public Builder sheetControlsOption(DashboardSheetControlsOptionArgs sheetControlsOption) {
            return sheetControlsOption(Output.of(sheetControlsOption));
        }

        public DashboardPublishOptionsArgs build() {
            return $;
        }
    }

}
