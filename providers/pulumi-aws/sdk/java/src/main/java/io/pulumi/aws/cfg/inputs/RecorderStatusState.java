// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RecorderStatusState extends io.pulumi.resources.ResourceArgs {

    public static final RecorderStatusState Empty = new RecorderStatusState();

    /**
     * Whether the configuration recorder should be enabled or disabled.
     * 
     */
    @Import(name="isEnabled")
      private final @Nullable Output<Boolean> isEnabled;

    public Output<Boolean> isEnabled() {
        return this.isEnabled == null ? Codegen.empty() : this.isEnabled;
    }

    /**
     * The name of the recorder
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public RecorderStatusState(
        @Nullable Output<Boolean> isEnabled,
        @Nullable Output<String> name) {
        this.isEnabled = isEnabled;
        this.name = name;
    }

    private RecorderStatusState() {
        this.isEnabled = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecorderStatusState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> isEnabled;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(RecorderStatusState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
    	      this.name = defaults.name;
        }

        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Builder isEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = Codegen.ofNullable(isEnabled);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public RecorderStatusState build() {
            return new RecorderStatusState(isEnabled, name);
        }
    }
}
