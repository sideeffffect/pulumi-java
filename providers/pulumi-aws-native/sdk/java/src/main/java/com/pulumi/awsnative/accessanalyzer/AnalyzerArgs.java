// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.accessanalyzer;

import com.pulumi.awsnative.accessanalyzer.inputs.AnalyzerArchiveRuleArgs;
import com.pulumi.awsnative.accessanalyzer.inputs.AnalyzerTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnalyzerArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnalyzerArgs Empty = new AnalyzerArgs();

    /**
     * Analyzer name
     * 
     */
    @Import(name="analyzerName")
    private @Nullable Output<String> analyzerName;

    public Optional<Output<String>> analyzerName() {
        return Optional.ofNullable(this.analyzerName);
    }

    @Import(name="archiveRules")
    private @Nullable Output<List<AnalyzerArchiveRuleArgs>> archiveRules;

    public Optional<Output<List<AnalyzerArchiveRuleArgs>>> archiveRules() {
        return Optional.ofNullable(this.archiveRules);
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<AnalyzerTagArgs>> tags;

    public Optional<Output<List<AnalyzerTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The type of the analyzer, must be ACCOUNT or ORGANIZATION
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private AnalyzerArgs() {}

    private AnalyzerArgs(AnalyzerArgs $) {
        this.analyzerName = $.analyzerName;
        this.archiveRules = $.archiveRules;
        this.tags = $.tags;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnalyzerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnalyzerArgs $;

        public Builder() {
            $ = new AnalyzerArgs();
        }

        public Builder(AnalyzerArgs defaults) {
            $ = new AnalyzerArgs(Objects.requireNonNull(defaults));
        }

        public Builder analyzerName(@Nullable Output<String> analyzerName) {
            $.analyzerName = analyzerName;
            return this;
        }

        public Builder analyzerName(String analyzerName) {
            return analyzerName(Output.of(analyzerName));
        }

        public Builder archiveRules(@Nullable Output<List<AnalyzerArchiveRuleArgs>> archiveRules) {
            $.archiveRules = archiveRules;
            return this;
        }

        public Builder archiveRules(List<AnalyzerArchiveRuleArgs> archiveRules) {
            return archiveRules(Output.of(archiveRules));
        }

        public Builder archiveRules(AnalyzerArchiveRuleArgs... archiveRules) {
            return archiveRules(List.of(archiveRules));
        }

        public Builder tags(@Nullable Output<List<AnalyzerTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<AnalyzerTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(AnalyzerTagArgs... tags) {
            return tags(List.of(tags));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AnalyzerArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
