// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.inputs;

import com.pulumi.awsnative.iotanalytics.inputs.PipelineAddAttributes;
import com.pulumi.awsnative.iotanalytics.inputs.PipelineChannel;
import com.pulumi.awsnative.iotanalytics.inputs.PipelineDatastore;
import com.pulumi.awsnative.iotanalytics.inputs.PipelineDeviceRegistryEnrich;
import com.pulumi.awsnative.iotanalytics.inputs.PipelineDeviceShadowEnrich;
import com.pulumi.awsnative.iotanalytics.inputs.PipelineFilter;
import com.pulumi.awsnative.iotanalytics.inputs.PipelineLambda;
import com.pulumi.awsnative.iotanalytics.inputs.PipelineMath;
import com.pulumi.awsnative.iotanalytics.inputs.PipelineRemoveAttributes;
import com.pulumi.awsnative.iotanalytics.inputs.PipelineSelectAttributes;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineActivity extends com.pulumi.resources.InvokeArgs {

    public static final PipelineActivity Empty = new PipelineActivity();

    @Import(name="addAttributes")
      private final @Nullable PipelineAddAttributes addAttributes;

    public Optional<PipelineAddAttributes> addAttributes() {
        return this.addAttributes == null ? Optional.empty() : Optional.ofNullable(this.addAttributes);
    }

    @Import(name="channel")
      private final @Nullable PipelineChannel channel;

    public Optional<PipelineChannel> channel() {
        return this.channel == null ? Optional.empty() : Optional.ofNullable(this.channel);
    }

    @Import(name="datastore")
      private final @Nullable PipelineDatastore datastore;

    public Optional<PipelineDatastore> datastore() {
        return this.datastore == null ? Optional.empty() : Optional.ofNullable(this.datastore);
    }

    @Import(name="deviceRegistryEnrich")
      private final @Nullable PipelineDeviceRegistryEnrich deviceRegistryEnrich;

    public Optional<PipelineDeviceRegistryEnrich> deviceRegistryEnrich() {
        return this.deviceRegistryEnrich == null ? Optional.empty() : Optional.ofNullable(this.deviceRegistryEnrich);
    }

    @Import(name="deviceShadowEnrich")
      private final @Nullable PipelineDeviceShadowEnrich deviceShadowEnrich;

    public Optional<PipelineDeviceShadowEnrich> deviceShadowEnrich() {
        return this.deviceShadowEnrich == null ? Optional.empty() : Optional.ofNullable(this.deviceShadowEnrich);
    }

    @Import(name="filter")
      private final @Nullable PipelineFilter filter;

    public Optional<PipelineFilter> filter() {
        return this.filter == null ? Optional.empty() : Optional.ofNullable(this.filter);
    }

    @Import(name="lambda")
      private final @Nullable PipelineLambda lambda;

    public Optional<PipelineLambda> lambda() {
        return this.lambda == null ? Optional.empty() : Optional.ofNullable(this.lambda);
    }

    @Import(name="math")
      private final @Nullable PipelineMath math;

    public Optional<PipelineMath> math() {
        return this.math == null ? Optional.empty() : Optional.ofNullable(this.math);
    }

    @Import(name="removeAttributes")
      private final @Nullable PipelineRemoveAttributes removeAttributes;

    public Optional<PipelineRemoveAttributes> removeAttributes() {
        return this.removeAttributes == null ? Optional.empty() : Optional.ofNullable(this.removeAttributes);
    }

    @Import(name="selectAttributes")
      private final @Nullable PipelineSelectAttributes selectAttributes;

    public Optional<PipelineSelectAttributes> selectAttributes() {
        return this.selectAttributes == null ? Optional.empty() : Optional.ofNullable(this.selectAttributes);
    }

    public PipelineActivity(
        @Nullable PipelineAddAttributes addAttributes,
        @Nullable PipelineChannel channel,
        @Nullable PipelineDatastore datastore,
        @Nullable PipelineDeviceRegistryEnrich deviceRegistryEnrich,
        @Nullable PipelineDeviceShadowEnrich deviceShadowEnrich,
        @Nullable PipelineFilter filter,
        @Nullable PipelineLambda lambda,
        @Nullable PipelineMath math,
        @Nullable PipelineRemoveAttributes removeAttributes,
        @Nullable PipelineSelectAttributes selectAttributes) {
        this.addAttributes = addAttributes;
        this.channel = channel;
        this.datastore = datastore;
        this.deviceRegistryEnrich = deviceRegistryEnrich;
        this.deviceShadowEnrich = deviceShadowEnrich;
        this.filter = filter;
        this.lambda = lambda;
        this.math = math;
        this.removeAttributes = removeAttributes;
        this.selectAttributes = selectAttributes;
    }

    private PipelineActivity() {
        this.addAttributes = null;
        this.channel = null;
        this.datastore = null;
        this.deviceRegistryEnrich = null;
        this.deviceShadowEnrich = null;
        this.filter = null;
        this.lambda = null;
        this.math = null;
        this.removeAttributes = null;
        this.selectAttributes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineActivity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PipelineAddAttributes addAttributes;
        private @Nullable PipelineChannel channel;
        private @Nullable PipelineDatastore datastore;
        private @Nullable PipelineDeviceRegistryEnrich deviceRegistryEnrich;
        private @Nullable PipelineDeviceShadowEnrich deviceShadowEnrich;
        private @Nullable PipelineFilter filter;
        private @Nullable PipelineLambda lambda;
        private @Nullable PipelineMath math;
        private @Nullable PipelineRemoveAttributes removeAttributes;
        private @Nullable PipelineSelectAttributes selectAttributes;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineActivity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addAttributes = defaults.addAttributes;
    	      this.channel = defaults.channel;
    	      this.datastore = defaults.datastore;
    	      this.deviceRegistryEnrich = defaults.deviceRegistryEnrich;
    	      this.deviceShadowEnrich = defaults.deviceShadowEnrich;
    	      this.filter = defaults.filter;
    	      this.lambda = defaults.lambda;
    	      this.math = defaults.math;
    	      this.removeAttributes = defaults.removeAttributes;
    	      this.selectAttributes = defaults.selectAttributes;
        }

        public Builder addAttributes(@Nullable PipelineAddAttributes addAttributes) {
            this.addAttributes = addAttributes;
            return this;
        }
        public Builder channel(@Nullable PipelineChannel channel) {
            this.channel = channel;
            return this;
        }
        public Builder datastore(@Nullable PipelineDatastore datastore) {
            this.datastore = datastore;
            return this;
        }
        public Builder deviceRegistryEnrich(@Nullable PipelineDeviceRegistryEnrich deviceRegistryEnrich) {
            this.deviceRegistryEnrich = deviceRegistryEnrich;
            return this;
        }
        public Builder deviceShadowEnrich(@Nullable PipelineDeviceShadowEnrich deviceShadowEnrich) {
            this.deviceShadowEnrich = deviceShadowEnrich;
            return this;
        }
        public Builder filter(@Nullable PipelineFilter filter) {
            this.filter = filter;
            return this;
        }
        public Builder lambda(@Nullable PipelineLambda lambda) {
            this.lambda = lambda;
            return this;
        }
        public Builder math(@Nullable PipelineMath math) {
            this.math = math;
            return this;
        }
        public Builder removeAttributes(@Nullable PipelineRemoveAttributes removeAttributes) {
            this.removeAttributes = removeAttributes;
            return this;
        }
        public Builder selectAttributes(@Nullable PipelineSelectAttributes selectAttributes) {
            this.selectAttributes = selectAttributes;
            return this;
        }        public PipelineActivity build() {
            return new PipelineActivity(addAttributes, channel, datastore, deviceRegistryEnrich, deviceShadowEnrich, filter, lambda, math, removeAttributes, selectAttributes);
        }
    }
}
