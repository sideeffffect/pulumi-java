// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.appengine_v1beta.enums.VpcAccessConnectorEgressSetting;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VPC access connector specification.
 * 
 */
public final class VpcAccessConnectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpcAccessConnectorArgs Empty = new VpcAccessConnectorArgs();

    /**
     * The egress setting for the connector, controlling what traffic is diverted through it.
     * 
     */
    @Import(name="egressSetting")
      private final @Nullable Output<VpcAccessConnectorEgressSetting> egressSetting;

    public Output<VpcAccessConnectorEgressSetting> egressSetting() {
        return this.egressSetting == null ? Codegen.empty() : this.egressSetting;
    }

    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public VpcAccessConnectorArgs(
        @Nullable Output<VpcAccessConnectorEgressSetting> egressSetting,
        @Nullable Output<String> name) {
        this.egressSetting = egressSetting;
        this.name = name;
    }

    private VpcAccessConnectorArgs() {
        this.egressSetting = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcAccessConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VpcAccessConnectorEgressSetting> egressSetting;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcAccessConnectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressSetting = defaults.egressSetting;
    	      this.name = defaults.name;
        }

        public Builder egressSetting(@Nullable Output<VpcAccessConnectorEgressSetting> egressSetting) {
            this.egressSetting = egressSetting;
            return this;
        }
        public Builder egressSetting(@Nullable VpcAccessConnectorEgressSetting egressSetting) {
            this.egressSetting = Codegen.ofNullable(egressSetting);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public VpcAccessConnectorArgs build() {
            return new VpcAccessConnectorArgs(egressSetting, name);
        }
    }
}
