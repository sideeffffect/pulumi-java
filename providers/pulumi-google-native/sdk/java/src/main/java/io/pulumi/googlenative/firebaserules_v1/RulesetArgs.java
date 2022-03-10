// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebaserules_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.firebaserules_v1.inputs.SourceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RulesetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RulesetArgs Empty = new RulesetArgs();

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * `Source` for the `Ruleset`.
     * 
     */
    @InputImport(name="source", required=true)
      private final Input<SourceArgs> source;

    public Input<SourceArgs> getSource() {
        return this.source;
    }

    public RulesetArgs(
        @Nullable Input<String> project,
        Input<SourceArgs> source) {
        this.project = project;
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private RulesetArgs() {
        this.project = Input.empty();
        this.source = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> project;
        private Input<SourceArgs> source;

        public Builder() {
    	      // Empty
        }

        public Builder(RulesetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.source = defaults.source;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder source(Input<SourceArgs> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder source(SourceArgs source) {
            this.source = Input.of(Objects.requireNonNull(source));
            return this;
        }
        public RulesetArgs build() {
            return new RulesetArgs(project, source);
        }
    }
}
