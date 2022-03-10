// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualNodeSpecServiceDiscoveryAwsCloudMap {
    /**
     * A string map that contains attributes with values that you can use to filter instances by any custom attribute that you specified when you registered the instance. Only instances that match all of the specified key/value pairs will be returned.
     * 
     */
    private final @Nullable Map<String,String> attributes;
    /**
     * The name of the AWS Cloud Map namespace to use.
     * Use the `aws.servicediscovery.HttpNamespace` resource to configure a Cloud Map namespace. Must be between 1 and 1024 characters in length.
     * 
     */
    private final String namespaceName;
    /**
     * The name of the AWS Cloud Map service to use. Use the `aws.servicediscovery.Service` resource to configure a Cloud Map service. Must be between 1 and 1024 characters in length.
     * 
     */
    private final String serviceName;

    @OutputCustomType.Constructor
    private VirtualNodeSpecServiceDiscoveryAwsCloudMap(
        @OutputCustomType.Parameter("attributes") @Nullable Map<String,String> attributes,
        @OutputCustomType.Parameter("namespaceName") String namespaceName,
        @OutputCustomType.Parameter("serviceName") String serviceName) {
        this.attributes = attributes;
        this.namespaceName = namespaceName;
        this.serviceName = serviceName;
    }

    /**
     * A string map that contains attributes with values that you can use to filter instances by any custom attribute that you specified when you registered the instance. Only instances that match all of the specified key/value pairs will be returned.
     * 
    */
    public Map<String,String> getAttributes() {
        return this.attributes == null ? Map.of() : this.attributes;
    }
    /**
     * The name of the AWS Cloud Map namespace to use.
     * Use the `aws.servicediscovery.HttpNamespace` resource to configure a Cloud Map namespace. Must be between 1 and 1024 characters in length.
     * 
    */
    public String getNamespaceName() {
        return this.namespaceName;
    }
    /**
     * The name of the AWS Cloud Map service to use. Use the `aws.servicediscovery.Service` resource to configure a Cloud Map service. Must be between 1 and 1024 characters in length.
     * 
    */
    public String getServiceName() {
        return this.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecServiceDiscoveryAwsCloudMap defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> attributes;
        private String namespaceName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecServiceDiscoveryAwsCloudMap defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.namespaceName = defaults.namespaceName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder attributes(@Nullable Map<String,String> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }

        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public VirtualNodeSpecServiceDiscoveryAwsCloudMap build() {
            return new VirtualNodeSpecServiceDiscoveryAwsCloudMap(attributes, namespaceName, serviceName);
        }
    }
}
