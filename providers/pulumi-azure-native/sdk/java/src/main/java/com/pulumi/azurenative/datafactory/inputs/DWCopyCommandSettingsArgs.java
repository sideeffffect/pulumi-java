// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.DWCopyCommandDefaultValueArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DW Copy Command settings.
 * 
 */
public final class DWCopyCommandSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DWCopyCommandSettingsArgs Empty = new DWCopyCommandSettingsArgs();

    /**
     * Additional options directly passed to SQL DW in Copy Command. Type: key value pairs (value should be string type) (or Expression with resultType object). Example: &#34;additionalOptions&#34;: { &#34;MAXERRORS&#34;: &#34;1000&#34;, &#34;DATEFORMAT&#34;: &#34;&#39;ymd&#39;&#34; }
     * 
     */
    @Import(name="additionalOptions")
    private @Nullable Output<Map<String,String>> additionalOptions;

    public Optional<Output<Map<String,String>>> additionalOptions() {
        return Optional.ofNullable(this.additionalOptions);
    }

    /**
     * Specifies the default values for each target column in SQL DW. The default values in the property overwrite the DEFAULT constraint set in the DB, and identity column cannot have a default value. Type: array of objects (or Expression with resultType array of objects).
     * 
     */
    @Import(name="defaultValues")
    private @Nullable Output<List<DWCopyCommandDefaultValueArgs>> defaultValues;

    public Optional<Output<List<DWCopyCommandDefaultValueArgs>>> defaultValues() {
        return Optional.ofNullable(this.defaultValues);
    }

    private DWCopyCommandSettingsArgs() {}

    private DWCopyCommandSettingsArgs(DWCopyCommandSettingsArgs $) {
        this.additionalOptions = $.additionalOptions;
        this.defaultValues = $.defaultValues;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DWCopyCommandSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DWCopyCommandSettingsArgs $;

        public Builder() {
            $ = new DWCopyCommandSettingsArgs();
        }

        public Builder(DWCopyCommandSettingsArgs defaults) {
            $ = new DWCopyCommandSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder additionalOptions(@Nullable Output<Map<String,String>> additionalOptions) {
            $.additionalOptions = additionalOptions;
            return this;
        }

        public Builder additionalOptions(Map<String,String> additionalOptions) {
            return additionalOptions(Output.of(additionalOptions));
        }

        public Builder defaultValues(@Nullable Output<List<DWCopyCommandDefaultValueArgs>> defaultValues) {
            $.defaultValues = defaultValues;
            return this;
        }

        public Builder defaultValues(List<DWCopyCommandDefaultValueArgs> defaultValues) {
            return defaultValues(Output.of(defaultValues));
        }

        public Builder defaultValues(DWCopyCommandDefaultValueArgs... defaultValues) {
            return defaultValues(List.of(defaultValues));
        }

        public DWCopyCommandSettingsArgs build() {
            return $;
        }
    }

}
