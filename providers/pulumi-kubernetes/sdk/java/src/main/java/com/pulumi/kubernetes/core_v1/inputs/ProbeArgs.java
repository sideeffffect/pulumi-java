// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.core_v1.inputs.ExecActionArgs;
import com.pulumi.kubernetes.core_v1.inputs.GRPCActionArgs;
import com.pulumi.kubernetes.core_v1.inputs.HTTPGetActionArgs;
import com.pulumi.kubernetes.core_v1.inputs.TCPSocketActionArgs;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
 * 
 */
public final class ProbeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProbeArgs Empty = new ProbeArgs();

    /**
     * Exec specifies the action to take.
     * 
     */
    @Import(name="exec")
      private final @Nullable Output<ExecActionArgs> exec;

    public Output<ExecActionArgs> exec() {
        return this.exec == null ? Codegen.empty() : this.exec;
    }

    /**
     * Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
     * 
     */
    @Import(name="failureThreshold")
      private final @Nullable Output<Integer> failureThreshold;

    public Output<Integer> failureThreshold() {
        return this.failureThreshold == null ? Codegen.empty() : this.failureThreshold;
    }

    /**
     * GRPC specifies an action involving a GRPC port. This is an alpha field and requires enabling GRPCContainerProbe feature gate.
     * 
     */
    @Import(name="grpc")
      private final @Nullable Output<GRPCActionArgs> grpc;

    public Output<GRPCActionArgs> grpc() {
        return this.grpc == null ? Codegen.empty() : this.grpc;
    }

    /**
     * HTTPGet specifies the http request to perform.
     * 
     */
    @Import(name="httpGet")
      private final @Nullable Output<HTTPGetActionArgs> httpGet;

    public Output<HTTPGetActionArgs> httpGet() {
        return this.httpGet == null ? Codegen.empty() : this.httpGet;
    }

    /**
     * Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @Import(name="initialDelaySeconds")
      private final @Nullable Output<Integer> initialDelaySeconds;

    public Output<Integer> initialDelaySeconds() {
        return this.initialDelaySeconds == null ? Codegen.empty() : this.initialDelaySeconds;
    }

    /**
     * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
     * 
     */
    @Import(name="periodSeconds")
      private final @Nullable Output<Integer> periodSeconds;

    public Output<Integer> periodSeconds() {
        return this.periodSeconds == null ? Codegen.empty() : this.periodSeconds;
    }

    /**
     * Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
     * 
     */
    @Import(name="successThreshold")
      private final @Nullable Output<Integer> successThreshold;

    public Output<Integer> successThreshold() {
        return this.successThreshold == null ? Codegen.empty() : this.successThreshold;
    }

    /**
     * TCPSocket specifies an action involving a TCP port.
     * 
     */
    @Import(name="tcpSocket")
      private final @Nullable Output<TCPSocketActionArgs> tcpSocket;

    public Output<TCPSocketActionArgs> tcpSocket() {
        return this.tcpSocket == null ? Codegen.empty() : this.tcpSocket;
    }

    /**
     * Optional duration in seconds the pod needs to terminate gracefully upon probe failure. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value is nil, the pod's terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). This is a beta field and requires enabling ProbeTerminationGracePeriod feature gate. Minimum value is 1. spec.terminationGracePeriodSeconds is used if unset.
     * 
     */
    @Import(name="terminationGracePeriodSeconds")
      private final @Nullable Output<Integer> terminationGracePeriodSeconds;

    public Output<Integer> terminationGracePeriodSeconds() {
        return this.terminationGracePeriodSeconds == null ? Codegen.empty() : this.terminationGracePeriodSeconds;
    }

    /**
     * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @Import(name="timeoutSeconds")
      private final @Nullable Output<Integer> timeoutSeconds;

    public Output<Integer> timeoutSeconds() {
        return this.timeoutSeconds == null ? Codegen.empty() : this.timeoutSeconds;
    }

    public ProbeArgs(
        @Nullable Output<ExecActionArgs> exec,
        @Nullable Output<Integer> failureThreshold,
        @Nullable Output<GRPCActionArgs> grpc,
        @Nullable Output<HTTPGetActionArgs> httpGet,
        @Nullable Output<Integer> initialDelaySeconds,
        @Nullable Output<Integer> periodSeconds,
        @Nullable Output<Integer> successThreshold,
        @Nullable Output<TCPSocketActionArgs> tcpSocket,
        @Nullable Output<Integer> terminationGracePeriodSeconds,
        @Nullable Output<Integer> timeoutSeconds) {
        this.exec = exec;
        this.failureThreshold = failureThreshold;
        this.grpc = grpc;
        this.httpGet = httpGet;
        this.initialDelaySeconds = initialDelaySeconds;
        this.periodSeconds = periodSeconds;
        this.successThreshold = successThreshold;
        this.tcpSocket = tcpSocket;
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        this.timeoutSeconds = timeoutSeconds;
    }

    private ProbeArgs() {
        this.exec = Codegen.empty();
        this.failureThreshold = Codegen.empty();
        this.grpc = Codegen.empty();
        this.httpGet = Codegen.empty();
        this.initialDelaySeconds = Codegen.empty();
        this.periodSeconds = Codegen.empty();
        this.successThreshold = Codegen.empty();
        this.tcpSocket = Codegen.empty();
        this.terminationGracePeriodSeconds = Codegen.empty();
        this.timeoutSeconds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProbeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ExecActionArgs> exec;
        private @Nullable Output<Integer> failureThreshold;
        private @Nullable Output<GRPCActionArgs> grpc;
        private @Nullable Output<HTTPGetActionArgs> httpGet;
        private @Nullable Output<Integer> initialDelaySeconds;
        private @Nullable Output<Integer> periodSeconds;
        private @Nullable Output<Integer> successThreshold;
        private @Nullable Output<TCPSocketActionArgs> tcpSocket;
        private @Nullable Output<Integer> terminationGracePeriodSeconds;
        private @Nullable Output<Integer> timeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(ProbeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exec = defaults.exec;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.grpc = defaults.grpc;
    	      this.httpGet = defaults.httpGet;
    	      this.initialDelaySeconds = defaults.initialDelaySeconds;
    	      this.periodSeconds = defaults.periodSeconds;
    	      this.successThreshold = defaults.successThreshold;
    	      this.tcpSocket = defaults.tcpSocket;
    	      this.terminationGracePeriodSeconds = defaults.terminationGracePeriodSeconds;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        public Builder exec(@Nullable Output<ExecActionArgs> exec) {
            this.exec = exec;
            return this;
        }
        public Builder exec(@Nullable ExecActionArgs exec) {
            this.exec = Codegen.ofNullable(exec);
            return this;
        }
        public Builder failureThreshold(@Nullable Output<Integer> failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Builder failureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = Codegen.ofNullable(failureThreshold);
            return this;
        }
        public Builder grpc(@Nullable Output<GRPCActionArgs> grpc) {
            this.grpc = grpc;
            return this;
        }
        public Builder grpc(@Nullable GRPCActionArgs grpc) {
            this.grpc = Codegen.ofNullable(grpc);
            return this;
        }
        public Builder httpGet(@Nullable Output<HTTPGetActionArgs> httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public Builder httpGet(@Nullable HTTPGetActionArgs httpGet) {
            this.httpGet = Codegen.ofNullable(httpGet);
            return this;
        }
        public Builder initialDelaySeconds(@Nullable Output<Integer> initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Builder initialDelaySeconds(@Nullable Integer initialDelaySeconds) {
            this.initialDelaySeconds = Codegen.ofNullable(initialDelaySeconds);
            return this;
        }
        public Builder periodSeconds(@Nullable Output<Integer> periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Builder periodSeconds(@Nullable Integer periodSeconds) {
            this.periodSeconds = Codegen.ofNullable(periodSeconds);
            return this;
        }
        public Builder successThreshold(@Nullable Output<Integer> successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Builder successThreshold(@Nullable Integer successThreshold) {
            this.successThreshold = Codegen.ofNullable(successThreshold);
            return this;
        }
        public Builder tcpSocket(@Nullable Output<TCPSocketActionArgs> tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        public Builder tcpSocket(@Nullable TCPSocketActionArgs tcpSocket) {
            this.tcpSocket = Codegen.ofNullable(tcpSocket);
            return this;
        }
        public Builder terminationGracePeriodSeconds(@Nullable Output<Integer> terminationGracePeriodSeconds) {
            this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            return this;
        }
        public Builder terminationGracePeriodSeconds(@Nullable Integer terminationGracePeriodSeconds) {
            this.terminationGracePeriodSeconds = Codegen.ofNullable(terminationGracePeriodSeconds);
            return this;
        }
        public Builder timeoutSeconds(@Nullable Output<Integer> timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = Codegen.ofNullable(timeoutSeconds);
            return this;
        }        public ProbeArgs build() {
            return new ProbeArgs(exec, failureThreshold, grpc, httpGet, initialDelaySeconds, periodSeconds, successThreshold, tcpSocket, terminationGracePeriodSeconds, timeoutSeconds);
        }
    }
}
