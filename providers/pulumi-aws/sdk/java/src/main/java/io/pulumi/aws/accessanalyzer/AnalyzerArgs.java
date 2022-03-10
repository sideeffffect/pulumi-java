// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.accessanalyzer;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyzerArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyzerArgs Empty = new AnalyzerArgs();

    /**
     * Name of the Analyzer.
     * 
     */
    @InputImport(name="analyzerName", required=true)
      private final Input<String> analyzerName;

    public Input<String> getAnalyzerName() {
        return this.analyzerName;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Type of Analyzer. Valid values are `ACCOUNT` or `ORGANIZATION`. Defaults to `ACCOUNT`.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public AnalyzerArgs(
        Input<String> analyzerName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> type) {
        this.analyzerName = Objects.requireNonNull(analyzerName, "expected parameter 'analyzerName' to be non-null");
        this.tags = tags;
        this.type = type;
    }

    private AnalyzerArgs() {
        this.analyzerName = Input.empty();
        this.tags = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyzerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> analyzerName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyzerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyzerName = defaults.analyzerName;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder analyzerName(Input<String> analyzerName) {
            this.analyzerName = Objects.requireNonNull(analyzerName);
            return this;
        }

        public Builder analyzerName(String analyzerName) {
            this.analyzerName = Input.of(Objects.requireNonNull(analyzerName));
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder type(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public AnalyzerArgs build() {
            return new AnalyzerArgs(analyzerName, tags, type);
        }
    }
}
