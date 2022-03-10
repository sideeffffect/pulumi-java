// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Description of an input or output of an execution stage.
 * 
 */
public final class StageSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final StageSourceArgs Empty = new StageSourceArgs();

    /**
     * Dataflow service generated name for this source.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * User name for the original user transform or collection with which this source is most closely associated.
     * 
     */
    @InputImport(name="originalTransformOrCollection")
      private final @Nullable Input<String> originalTransformOrCollection;

    public Input<String> getOriginalTransformOrCollection() {
        return this.originalTransformOrCollection == null ? Input.empty() : this.originalTransformOrCollection;
    }

    /**
     * Size of the source, if measurable.
     * 
     */
    @InputImport(name="sizeBytes")
      private final @Nullable Input<String> sizeBytes;

    public Input<String> getSizeBytes() {
        return this.sizeBytes == null ? Input.empty() : this.sizeBytes;
    }

    /**
     * Human-readable name for this source; may be user or system generated.
     * 
     */
    @InputImport(name="userName")
      private final @Nullable Input<String> userName;

    public Input<String> getUserName() {
        return this.userName == null ? Input.empty() : this.userName;
    }

    public StageSourceArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> originalTransformOrCollection,
        @Nullable Input<String> sizeBytes,
        @Nullable Input<String> userName) {
        this.name = name;
        this.originalTransformOrCollection = originalTransformOrCollection;
        this.sizeBytes = sizeBytes;
        this.userName = userName;
    }

    private StageSourceArgs() {
        this.name = Input.empty();
        this.originalTransformOrCollection = Input.empty();
        this.sizeBytes = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StageSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> originalTransformOrCollection;
        private @Nullable Input<String> sizeBytes;
        private @Nullable Input<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(StageSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.originalTransformOrCollection = defaults.originalTransformOrCollection;
    	      this.sizeBytes = defaults.sizeBytes;
    	      this.userName = defaults.userName;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder originalTransformOrCollection(@Nullable Input<String> originalTransformOrCollection) {
            this.originalTransformOrCollection = originalTransformOrCollection;
            return this;
        }

        public Builder originalTransformOrCollection(@Nullable String originalTransformOrCollection) {
            this.originalTransformOrCollection = Input.ofNullable(originalTransformOrCollection);
            return this;
        }

        public Builder sizeBytes(@Nullable Input<String> sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }

        public Builder sizeBytes(@Nullable String sizeBytes) {
            this.sizeBytes = Input.ofNullable(sizeBytes);
            return this;
        }

        public Builder userName(@Nullable Input<String> userName) {
            this.userName = userName;
            return this;
        }

        public Builder userName(@Nullable String userName) {
            this.userName = Input.ofNullable(userName);
            return this;
        }
        public StageSourceArgs build() {
            return new StageSourceArgs(name, originalTransformOrCollection, sizeBytes, userName);
        }
    }
}
