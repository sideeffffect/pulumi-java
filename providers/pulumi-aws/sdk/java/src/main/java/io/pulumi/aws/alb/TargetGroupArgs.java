// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb;

import io.pulumi.aws.alb.inputs.TargetGroupHealthCheckArgs;
import io.pulumi.aws.alb.inputs.TargetGroupStickinessArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final TargetGroupArgs Empty = new TargetGroupArgs();

    /**
     * Whether to terminate connections at the end of the deregistration timeout on Network Load Balancers. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#deregistration-delay) for more information. Default is `false`.
     * 
     */
    @Import(name="connectionTermination")
      private final @Nullable Output<Boolean> connectionTermination;

    public Output<Boolean> connectionTermination() {
        return this.connectionTermination == null ? Codegen.empty() : this.connectionTermination;
    }

    /**
     * Amount time for Elastic Load Balancing to wait before changing the state of a deregistering target from draining to unused. The range is 0-3600 seconds. The default value is 300 seconds.
     * 
     */
    @Import(name="deregistrationDelay")
      private final @Nullable Output<Integer> deregistrationDelay;

    public Output<Integer> deregistrationDelay() {
        return this.deregistrationDelay == null ? Codegen.empty() : this.deregistrationDelay;
    }

    /**
     * Health Check configuration block. Detailed below.
     * 
     */
    @Import(name="healthCheck")
      private final @Nullable Output<TargetGroupHealthCheckArgs> healthCheck;

    public Output<TargetGroupHealthCheckArgs> healthCheck() {
        return this.healthCheck == null ? Codegen.empty() : this.healthCheck;
    }

    /**
     * Whether the request and response headers exchanged between the load balancer and the Lambda function include arrays of values or strings. Only applies when `target_type` is `lambda`. Default is `false`.
     * 
     */
    @Import(name="lambdaMultiValueHeadersEnabled")
      private final @Nullable Output<Boolean> lambdaMultiValueHeadersEnabled;

    public Output<Boolean> lambdaMultiValueHeadersEnabled() {
        return this.lambdaMultiValueHeadersEnabled == null ? Codegen.empty() : this.lambdaMultiValueHeadersEnabled;
    }

    /**
     * Determines how the load balancer selects targets when routing requests. Only applicable for Application Load Balancer Target Groups. The value is `round_robin` or `least_outstanding_requests`. The default is `round_robin`.
     * 
     */
    @Import(name="loadBalancingAlgorithmType")
      private final @Nullable Output<String> loadBalancingAlgorithmType;

    public Output<String> loadBalancingAlgorithmType() {
        return this.loadBalancingAlgorithmType == null ? Codegen.empty() : this.loadBalancingAlgorithmType;
    }

    /**
     * Name of the target group. If omitted, this provider will assign a random, unique name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Cannot be longer than 6 characters.
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> namePrefix() {
        return this.namePrefix == null ? Codegen.empty() : this.namePrefix;
    }

    /**
     * Port to use to connect with the target. Valid values are either ports 1-65535, or `traffic-port`. Defaults to `traffic-port`.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> port() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    /**
     * Whether client IP preservation is enabled. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#client-ip-preservation) for more information.
     * 
     */
    @Import(name="preserveClientIp")
      private final @Nullable Output<String> preserveClientIp;

    public Output<String> preserveClientIp() {
        return this.preserveClientIp == null ? Codegen.empty() : this.preserveClientIp;
    }

    /**
     * Protocol to use to connect with the target. Defaults to `HTTP`. Not applicable when `target_type` is `lambda`.
     * 
     */
    @Import(name="protocol")
      private final @Nullable Output<String> protocol;

    public Output<String> protocol() {
        return this.protocol == null ? Codegen.empty() : this.protocol;
    }

    /**
     * Only applicable when `protocol` is `HTTP` or `HTTPS`. The protocol version. Specify GRPC to send requests to targets using gRPC. Specify HTTP2 to send requests to targets using HTTP/2. The default is HTTP1, which sends requests to targets using HTTP/1.1
     * 
     */
    @Import(name="protocolVersion")
      private final @Nullable Output<String> protocolVersion;

    public Output<String> protocolVersion() {
        return this.protocolVersion == null ? Codegen.empty() : this.protocolVersion;
    }

    /**
     * Whether to enable support for proxy protocol v2 on Network Load Balancers. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#proxy-protocol) for more information. Default is `false`.
     * 
     */
    @Import(name="proxyProtocolV2")
      private final @Nullable Output<Boolean> proxyProtocolV2;

    public Output<Boolean> proxyProtocolV2() {
        return this.proxyProtocolV2 == null ? Codegen.empty() : this.proxyProtocolV2;
    }

    /**
     * Amount time for targets to warm up before the load balancer sends them a full share of requests. The range is 30-900 seconds or 0 to disable. The default value is 0 seconds.
     * 
     */
    @Import(name="slowStart")
      private final @Nullable Output<Integer> slowStart;

    public Output<Integer> slowStart() {
        return this.slowStart == null ? Codegen.empty() : this.slowStart;
    }

    /**
     * Stickiness configuration block. Detailed below.
     * 
     */
    @Import(name="stickiness")
      private final @Nullable Output<TargetGroupStickinessArgs> stickiness;

    public Output<TargetGroupStickinessArgs> stickiness() {
        return this.stickiness == null ? Codegen.empty() : this.stickiness;
    }

    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Type of target that you must specify when registering targets with this target group. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_CreateTargetGroup.html) for supported values. The default is `instance`.
     * 
     */
    @Import(name="targetType")
      private final @Nullable Output<String> targetType;

    public Output<String> targetType() {
        return this.targetType == null ? Codegen.empty() : this.targetType;
    }

    /**
     * Identifier of the VPC in which to create the target group. Required when `target_type` is `instance` or `ip`. Does not apply when `target_type` is `lambda`.
     * 
     */
    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> vpcId() {
        return this.vpcId == null ? Codegen.empty() : this.vpcId;
    }

    public TargetGroupArgs(
        @Nullable Output<Boolean> connectionTermination,
        @Nullable Output<Integer> deregistrationDelay,
        @Nullable Output<TargetGroupHealthCheckArgs> healthCheck,
        @Nullable Output<Boolean> lambdaMultiValueHeadersEnabled,
        @Nullable Output<String> loadBalancingAlgorithmType,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<Integer> port,
        @Nullable Output<String> preserveClientIp,
        @Nullable Output<String> protocol,
        @Nullable Output<String> protocolVersion,
        @Nullable Output<Boolean> proxyProtocolV2,
        @Nullable Output<Integer> slowStart,
        @Nullable Output<TargetGroupStickinessArgs> stickiness,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> targetType,
        @Nullable Output<String> vpcId) {
        this.connectionTermination = connectionTermination;
        this.deregistrationDelay = deregistrationDelay;
        this.healthCheck = healthCheck;
        this.lambdaMultiValueHeadersEnabled = lambdaMultiValueHeadersEnabled;
        this.loadBalancingAlgorithmType = loadBalancingAlgorithmType;
        this.name = name;
        this.namePrefix = namePrefix;
        this.port = port;
        this.preserveClientIp = preserveClientIp;
        this.protocol = protocol;
        this.protocolVersion = protocolVersion;
        this.proxyProtocolV2 = proxyProtocolV2;
        this.slowStart = slowStart;
        this.stickiness = stickiness;
        this.tags = tags;
        this.targetType = targetType;
        this.vpcId = vpcId;
    }

    private TargetGroupArgs() {
        this.connectionTermination = Codegen.empty();
        this.deregistrationDelay = Codegen.empty();
        this.healthCheck = Codegen.empty();
        this.lambdaMultiValueHeadersEnabled = Codegen.empty();
        this.loadBalancingAlgorithmType = Codegen.empty();
        this.name = Codegen.empty();
        this.namePrefix = Codegen.empty();
        this.port = Codegen.empty();
        this.preserveClientIp = Codegen.empty();
        this.protocol = Codegen.empty();
        this.protocolVersion = Codegen.empty();
        this.proxyProtocolV2 = Codegen.empty();
        this.slowStart = Codegen.empty();
        this.stickiness = Codegen.empty();
        this.tags = Codegen.empty();
        this.targetType = Codegen.empty();
        this.vpcId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> connectionTermination;
        private @Nullable Output<Integer> deregistrationDelay;
        private @Nullable Output<TargetGroupHealthCheckArgs> healthCheck;
        private @Nullable Output<Boolean> lambdaMultiValueHeadersEnabled;
        private @Nullable Output<String> loadBalancingAlgorithmType;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> preserveClientIp;
        private @Nullable Output<String> protocol;
        private @Nullable Output<String> protocolVersion;
        private @Nullable Output<Boolean> proxyProtocolV2;
        private @Nullable Output<Integer> slowStart;
        private @Nullable Output<TargetGroupStickinessArgs> stickiness;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> targetType;
        private @Nullable Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionTermination = defaults.connectionTermination;
    	      this.deregistrationDelay = defaults.deregistrationDelay;
    	      this.healthCheck = defaults.healthCheck;
    	      this.lambdaMultiValueHeadersEnabled = defaults.lambdaMultiValueHeadersEnabled;
    	      this.loadBalancingAlgorithmType = defaults.loadBalancingAlgorithmType;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.port = defaults.port;
    	      this.preserveClientIp = defaults.preserveClientIp;
    	      this.protocol = defaults.protocol;
    	      this.protocolVersion = defaults.protocolVersion;
    	      this.proxyProtocolV2 = defaults.proxyProtocolV2;
    	      this.slowStart = defaults.slowStart;
    	      this.stickiness = defaults.stickiness;
    	      this.tags = defaults.tags;
    	      this.targetType = defaults.targetType;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder connectionTermination(@Nullable Output<Boolean> connectionTermination) {
            this.connectionTermination = connectionTermination;
            return this;
        }
        public Builder connectionTermination(@Nullable Boolean connectionTermination) {
            this.connectionTermination = Codegen.ofNullable(connectionTermination);
            return this;
        }
        public Builder deregistrationDelay(@Nullable Output<Integer> deregistrationDelay) {
            this.deregistrationDelay = deregistrationDelay;
            return this;
        }
        public Builder deregistrationDelay(@Nullable Integer deregistrationDelay) {
            this.deregistrationDelay = Codegen.ofNullable(deregistrationDelay);
            return this;
        }
        public Builder healthCheck(@Nullable Output<TargetGroupHealthCheckArgs> healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public Builder healthCheck(@Nullable TargetGroupHealthCheckArgs healthCheck) {
            this.healthCheck = Codegen.ofNullable(healthCheck);
            return this;
        }
        public Builder lambdaMultiValueHeadersEnabled(@Nullable Output<Boolean> lambdaMultiValueHeadersEnabled) {
            this.lambdaMultiValueHeadersEnabled = lambdaMultiValueHeadersEnabled;
            return this;
        }
        public Builder lambdaMultiValueHeadersEnabled(@Nullable Boolean lambdaMultiValueHeadersEnabled) {
            this.lambdaMultiValueHeadersEnabled = Codegen.ofNullable(lambdaMultiValueHeadersEnabled);
            return this;
        }
        public Builder loadBalancingAlgorithmType(@Nullable Output<String> loadBalancingAlgorithmType) {
            this.loadBalancingAlgorithmType = loadBalancingAlgorithmType;
            return this;
        }
        public Builder loadBalancingAlgorithmType(@Nullable String loadBalancingAlgorithmType) {
            this.loadBalancingAlgorithmType = Codegen.ofNullable(loadBalancingAlgorithmType);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Codegen.ofNullable(namePrefix);
            return this;
        }
        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Codegen.ofNullable(port);
            return this;
        }
        public Builder preserveClientIp(@Nullable Output<String> preserveClientIp) {
            this.preserveClientIp = preserveClientIp;
            return this;
        }
        public Builder preserveClientIp(@Nullable String preserveClientIp) {
            this.preserveClientIp = Codegen.ofNullable(preserveClientIp);
            return this;
        }
        public Builder protocol(@Nullable Output<String> protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = Codegen.ofNullable(protocol);
            return this;
        }
        public Builder protocolVersion(@Nullable Output<String> protocolVersion) {
            this.protocolVersion = protocolVersion;
            return this;
        }
        public Builder protocolVersion(@Nullable String protocolVersion) {
            this.protocolVersion = Codegen.ofNullable(protocolVersion);
            return this;
        }
        public Builder proxyProtocolV2(@Nullable Output<Boolean> proxyProtocolV2) {
            this.proxyProtocolV2 = proxyProtocolV2;
            return this;
        }
        public Builder proxyProtocolV2(@Nullable Boolean proxyProtocolV2) {
            this.proxyProtocolV2 = Codegen.ofNullable(proxyProtocolV2);
            return this;
        }
        public Builder slowStart(@Nullable Output<Integer> slowStart) {
            this.slowStart = slowStart;
            return this;
        }
        public Builder slowStart(@Nullable Integer slowStart) {
            this.slowStart = Codegen.ofNullable(slowStart);
            return this;
        }
        public Builder stickiness(@Nullable Output<TargetGroupStickinessArgs> stickiness) {
            this.stickiness = stickiness;
            return this;
        }
        public Builder stickiness(@Nullable TargetGroupStickinessArgs stickiness) {
            this.stickiness = Codegen.ofNullable(stickiness);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder targetType(@Nullable Output<String> targetType) {
            this.targetType = targetType;
            return this;
        }
        public Builder targetType(@Nullable String targetType) {
            this.targetType = Codegen.ofNullable(targetType);
            return this;
        }
        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Codegen.ofNullable(vpcId);
            return this;
        }        public TargetGroupArgs build() {
            return new TargetGroupArgs(connectionTermination, deregistrationDelay, healthCheck, lambdaMultiValueHeadersEnabled, loadBalancingAlgorithmType, name, namePrefix, port, preserveClientIp, protocol, protocolVersion, proxyProtocolV2, slowStart, stickiness, tags, targetType, vpcId);
        }
    }
}
