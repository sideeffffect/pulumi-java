// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.enums.SpotFleetInstanceRequirementsRequestAcceleratorManufacturersItem;
import io.pulumi.awsnative.ec2.enums.SpotFleetInstanceRequirementsRequestAcceleratorNamesItem;
import io.pulumi.awsnative.ec2.enums.SpotFleetInstanceRequirementsRequestAcceleratorTypesItem;
import io.pulumi.awsnative.ec2.enums.SpotFleetInstanceRequirementsRequestBareMetal;
import io.pulumi.awsnative.ec2.enums.SpotFleetInstanceRequirementsRequestBurstablePerformance;
import io.pulumi.awsnative.ec2.enums.SpotFleetInstanceRequirementsRequestCpuManufacturersItem;
import io.pulumi.awsnative.ec2.enums.SpotFleetInstanceRequirementsRequestInstanceGenerationsItem;
import io.pulumi.awsnative.ec2.enums.SpotFleetInstanceRequirementsRequestLocalStorage;
import io.pulumi.awsnative.ec2.enums.SpotFleetInstanceRequirementsRequestLocalStorageTypesItem;
import io.pulumi.awsnative.ec2.inputs.SpotFleetAcceleratorCountRequest;
import io.pulumi.awsnative.ec2.inputs.SpotFleetAcceleratorTotalMemoryMiBRequest;
import io.pulumi.awsnative.ec2.inputs.SpotFleetBaselineEbsBandwidthMbpsRequest;
import io.pulumi.awsnative.ec2.inputs.SpotFleetMemoryGiBPerVCpuRequest;
import io.pulumi.awsnative.ec2.inputs.SpotFleetMemoryMiBRequest;
import io.pulumi.awsnative.ec2.inputs.SpotFleetNetworkInterfaceCountRequest;
import io.pulumi.awsnative.ec2.inputs.SpotFleetTotalLocalStorageGBRequest;
import io.pulumi.awsnative.ec2.inputs.SpotFleetVCpuCountRangeRequest;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotFleetInstanceRequirementsRequest extends io.pulumi.resources.InvokeArgs {

    public static final SpotFleetInstanceRequirementsRequest Empty = new SpotFleetInstanceRequirementsRequest();

    @InputImport(name="acceleratorCount")
      private final @Nullable SpotFleetAcceleratorCountRequest acceleratorCount;

    public Optional<SpotFleetAcceleratorCountRequest> getAcceleratorCount() {
        return this.acceleratorCount == null ? Optional.empty() : Optional.ofNullable(this.acceleratorCount);
    }

    @InputImport(name="acceleratorManufacturers")
      private final @Nullable List<SpotFleetInstanceRequirementsRequestAcceleratorManufacturersItem> acceleratorManufacturers;

    public List<SpotFleetInstanceRequirementsRequestAcceleratorManufacturersItem> getAcceleratorManufacturers() {
        return this.acceleratorManufacturers == null ? List.of() : this.acceleratorManufacturers;
    }

    @InputImport(name="acceleratorNames")
      private final @Nullable List<SpotFleetInstanceRequirementsRequestAcceleratorNamesItem> acceleratorNames;

    public List<SpotFleetInstanceRequirementsRequestAcceleratorNamesItem> getAcceleratorNames() {
        return this.acceleratorNames == null ? List.of() : this.acceleratorNames;
    }

    @InputImport(name="acceleratorTotalMemoryMiB")
      private final @Nullable SpotFleetAcceleratorTotalMemoryMiBRequest acceleratorTotalMemoryMiB;

    public Optional<SpotFleetAcceleratorTotalMemoryMiBRequest> getAcceleratorTotalMemoryMiB() {
        return this.acceleratorTotalMemoryMiB == null ? Optional.empty() : Optional.ofNullable(this.acceleratorTotalMemoryMiB);
    }

    @InputImport(name="acceleratorTypes")
      private final @Nullable List<SpotFleetInstanceRequirementsRequestAcceleratorTypesItem> acceleratorTypes;

    public List<SpotFleetInstanceRequirementsRequestAcceleratorTypesItem> getAcceleratorTypes() {
        return this.acceleratorTypes == null ? List.of() : this.acceleratorTypes;
    }

    @InputImport(name="bareMetal")
      private final @Nullable SpotFleetInstanceRequirementsRequestBareMetal bareMetal;

    public Optional<SpotFleetInstanceRequirementsRequestBareMetal> getBareMetal() {
        return this.bareMetal == null ? Optional.empty() : Optional.ofNullable(this.bareMetal);
    }

    @InputImport(name="baselineEbsBandwidthMbps")
      private final @Nullable SpotFleetBaselineEbsBandwidthMbpsRequest baselineEbsBandwidthMbps;

    public Optional<SpotFleetBaselineEbsBandwidthMbpsRequest> getBaselineEbsBandwidthMbps() {
        return this.baselineEbsBandwidthMbps == null ? Optional.empty() : Optional.ofNullable(this.baselineEbsBandwidthMbps);
    }

    @InputImport(name="burstablePerformance")
      private final @Nullable SpotFleetInstanceRequirementsRequestBurstablePerformance burstablePerformance;

    public Optional<SpotFleetInstanceRequirementsRequestBurstablePerformance> getBurstablePerformance() {
        return this.burstablePerformance == null ? Optional.empty() : Optional.ofNullable(this.burstablePerformance);
    }

    @InputImport(name="cpuManufacturers")
      private final @Nullable List<SpotFleetInstanceRequirementsRequestCpuManufacturersItem> cpuManufacturers;

    public List<SpotFleetInstanceRequirementsRequestCpuManufacturersItem> getCpuManufacturers() {
        return this.cpuManufacturers == null ? List.of() : this.cpuManufacturers;
    }

    @InputImport(name="excludedInstanceTypes")
      private final @Nullable List<String> excludedInstanceTypes;

    public List<String> getExcludedInstanceTypes() {
        return this.excludedInstanceTypes == null ? List.of() : this.excludedInstanceTypes;
    }

    @InputImport(name="instanceGenerations")
      private final @Nullable List<SpotFleetInstanceRequirementsRequestInstanceGenerationsItem> instanceGenerations;

    public List<SpotFleetInstanceRequirementsRequestInstanceGenerationsItem> getInstanceGenerations() {
        return this.instanceGenerations == null ? List.of() : this.instanceGenerations;
    }

    @InputImport(name="localStorage")
      private final @Nullable SpotFleetInstanceRequirementsRequestLocalStorage localStorage;

    public Optional<SpotFleetInstanceRequirementsRequestLocalStorage> getLocalStorage() {
        return this.localStorage == null ? Optional.empty() : Optional.ofNullable(this.localStorage);
    }

    @InputImport(name="localStorageTypes")
      private final @Nullable List<SpotFleetInstanceRequirementsRequestLocalStorageTypesItem> localStorageTypes;

    public List<SpotFleetInstanceRequirementsRequestLocalStorageTypesItem> getLocalStorageTypes() {
        return this.localStorageTypes == null ? List.of() : this.localStorageTypes;
    }

    @InputImport(name="memoryGiBPerVCpu")
      private final @Nullable SpotFleetMemoryGiBPerVCpuRequest memoryGiBPerVCpu;

    public Optional<SpotFleetMemoryGiBPerVCpuRequest> getMemoryGiBPerVCpu() {
        return this.memoryGiBPerVCpu == null ? Optional.empty() : Optional.ofNullable(this.memoryGiBPerVCpu);
    }

    @InputImport(name="memoryMiB")
      private final @Nullable SpotFleetMemoryMiBRequest memoryMiB;

    public Optional<SpotFleetMemoryMiBRequest> getMemoryMiB() {
        return this.memoryMiB == null ? Optional.empty() : Optional.ofNullable(this.memoryMiB);
    }

    @InputImport(name="networkInterfaceCount")
      private final @Nullable SpotFleetNetworkInterfaceCountRequest networkInterfaceCount;

    public Optional<SpotFleetNetworkInterfaceCountRequest> getNetworkInterfaceCount() {
        return this.networkInterfaceCount == null ? Optional.empty() : Optional.ofNullable(this.networkInterfaceCount);
    }

    @InputImport(name="onDemandMaxPricePercentageOverLowestPrice")
      private final @Nullable Integer onDemandMaxPricePercentageOverLowestPrice;

    public Optional<Integer> getOnDemandMaxPricePercentageOverLowestPrice() {
        return this.onDemandMaxPricePercentageOverLowestPrice == null ? Optional.empty() : Optional.ofNullable(this.onDemandMaxPricePercentageOverLowestPrice);
    }

    @InputImport(name="requireHibernateSupport")
      private final @Nullable Boolean requireHibernateSupport;

    public Optional<Boolean> getRequireHibernateSupport() {
        return this.requireHibernateSupport == null ? Optional.empty() : Optional.ofNullable(this.requireHibernateSupport);
    }

    @InputImport(name="spotMaxPricePercentageOverLowestPrice")
      private final @Nullable Integer spotMaxPricePercentageOverLowestPrice;

    public Optional<Integer> getSpotMaxPricePercentageOverLowestPrice() {
        return this.spotMaxPricePercentageOverLowestPrice == null ? Optional.empty() : Optional.ofNullable(this.spotMaxPricePercentageOverLowestPrice);
    }

    @InputImport(name="totalLocalStorageGB")
      private final @Nullable SpotFleetTotalLocalStorageGBRequest totalLocalStorageGB;

    public Optional<SpotFleetTotalLocalStorageGBRequest> getTotalLocalStorageGB() {
        return this.totalLocalStorageGB == null ? Optional.empty() : Optional.ofNullable(this.totalLocalStorageGB);
    }

    @InputImport(name="vCpuCount")
      private final @Nullable SpotFleetVCpuCountRangeRequest vCpuCount;

    public Optional<SpotFleetVCpuCountRangeRequest> getVCpuCount() {
        return this.vCpuCount == null ? Optional.empty() : Optional.ofNullable(this.vCpuCount);
    }

    public SpotFleetInstanceRequirementsRequest(
        @Nullable SpotFleetAcceleratorCountRequest acceleratorCount,
        @Nullable List<SpotFleetInstanceRequirementsRequestAcceleratorManufacturersItem> acceleratorManufacturers,
        @Nullable List<SpotFleetInstanceRequirementsRequestAcceleratorNamesItem> acceleratorNames,
        @Nullable SpotFleetAcceleratorTotalMemoryMiBRequest acceleratorTotalMemoryMiB,
        @Nullable List<SpotFleetInstanceRequirementsRequestAcceleratorTypesItem> acceleratorTypes,
        @Nullable SpotFleetInstanceRequirementsRequestBareMetal bareMetal,
        @Nullable SpotFleetBaselineEbsBandwidthMbpsRequest baselineEbsBandwidthMbps,
        @Nullable SpotFleetInstanceRequirementsRequestBurstablePerformance burstablePerformance,
        @Nullable List<SpotFleetInstanceRequirementsRequestCpuManufacturersItem> cpuManufacturers,
        @Nullable List<String> excludedInstanceTypes,
        @Nullable List<SpotFleetInstanceRequirementsRequestInstanceGenerationsItem> instanceGenerations,
        @Nullable SpotFleetInstanceRequirementsRequestLocalStorage localStorage,
        @Nullable List<SpotFleetInstanceRequirementsRequestLocalStorageTypesItem> localStorageTypes,
        @Nullable SpotFleetMemoryGiBPerVCpuRequest memoryGiBPerVCpu,
        @Nullable SpotFleetMemoryMiBRequest memoryMiB,
        @Nullable SpotFleetNetworkInterfaceCountRequest networkInterfaceCount,
        @Nullable Integer onDemandMaxPricePercentageOverLowestPrice,
        @Nullable Boolean requireHibernateSupport,
        @Nullable Integer spotMaxPricePercentageOverLowestPrice,
        @Nullable SpotFleetTotalLocalStorageGBRequest totalLocalStorageGB,
        @Nullable SpotFleetVCpuCountRangeRequest vCpuCount) {
        this.acceleratorCount = acceleratorCount;
        this.acceleratorManufacturers = acceleratorManufacturers;
        this.acceleratorNames = acceleratorNames;
        this.acceleratorTotalMemoryMiB = acceleratorTotalMemoryMiB;
        this.acceleratorTypes = acceleratorTypes;
        this.bareMetal = bareMetal;
        this.baselineEbsBandwidthMbps = baselineEbsBandwidthMbps;
        this.burstablePerformance = burstablePerformance;
        this.cpuManufacturers = cpuManufacturers;
        this.excludedInstanceTypes = excludedInstanceTypes;
        this.instanceGenerations = instanceGenerations;
        this.localStorage = localStorage;
        this.localStorageTypes = localStorageTypes;
        this.memoryGiBPerVCpu = memoryGiBPerVCpu;
        this.memoryMiB = memoryMiB;
        this.networkInterfaceCount = networkInterfaceCount;
        this.onDemandMaxPricePercentageOverLowestPrice = onDemandMaxPricePercentageOverLowestPrice;
        this.requireHibernateSupport = requireHibernateSupport;
        this.spotMaxPricePercentageOverLowestPrice = spotMaxPricePercentageOverLowestPrice;
        this.totalLocalStorageGB = totalLocalStorageGB;
        this.vCpuCount = vCpuCount;
    }

    private SpotFleetInstanceRequirementsRequest() {
        this.acceleratorCount = null;
        this.acceleratorManufacturers = List.of();
        this.acceleratorNames = List.of();
        this.acceleratorTotalMemoryMiB = null;
        this.acceleratorTypes = List.of();
        this.bareMetal = null;
        this.baselineEbsBandwidthMbps = null;
        this.burstablePerformance = null;
        this.cpuManufacturers = List.of();
        this.excludedInstanceTypes = List.of();
        this.instanceGenerations = List.of();
        this.localStorage = null;
        this.localStorageTypes = List.of();
        this.memoryGiBPerVCpu = null;
        this.memoryMiB = null;
        this.networkInterfaceCount = null;
        this.onDemandMaxPricePercentageOverLowestPrice = null;
        this.requireHibernateSupport = null;
        this.spotMaxPricePercentageOverLowestPrice = null;
        this.totalLocalStorageGB = null;
        this.vCpuCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetInstanceRequirementsRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SpotFleetAcceleratorCountRequest acceleratorCount;
        private @Nullable List<SpotFleetInstanceRequirementsRequestAcceleratorManufacturersItem> acceleratorManufacturers;
        private @Nullable List<SpotFleetInstanceRequirementsRequestAcceleratorNamesItem> acceleratorNames;
        private @Nullable SpotFleetAcceleratorTotalMemoryMiBRequest acceleratorTotalMemoryMiB;
        private @Nullable List<SpotFleetInstanceRequirementsRequestAcceleratorTypesItem> acceleratorTypes;
        private @Nullable SpotFleetInstanceRequirementsRequestBareMetal bareMetal;
        private @Nullable SpotFleetBaselineEbsBandwidthMbpsRequest baselineEbsBandwidthMbps;
        private @Nullable SpotFleetInstanceRequirementsRequestBurstablePerformance burstablePerformance;
        private @Nullable List<SpotFleetInstanceRequirementsRequestCpuManufacturersItem> cpuManufacturers;
        private @Nullable List<String> excludedInstanceTypes;
        private @Nullable List<SpotFleetInstanceRequirementsRequestInstanceGenerationsItem> instanceGenerations;
        private @Nullable SpotFleetInstanceRequirementsRequestLocalStorage localStorage;
        private @Nullable List<SpotFleetInstanceRequirementsRequestLocalStorageTypesItem> localStorageTypes;
        private @Nullable SpotFleetMemoryGiBPerVCpuRequest memoryGiBPerVCpu;
        private @Nullable SpotFleetMemoryMiBRequest memoryMiB;
        private @Nullable SpotFleetNetworkInterfaceCountRequest networkInterfaceCount;
        private @Nullable Integer onDemandMaxPricePercentageOverLowestPrice;
        private @Nullable Boolean requireHibernateSupport;
        private @Nullable Integer spotMaxPricePercentageOverLowestPrice;
        private @Nullable SpotFleetTotalLocalStorageGBRequest totalLocalStorageGB;
        private @Nullable SpotFleetVCpuCountRangeRequest vCpuCount;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetInstanceRequirementsRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorCount = defaults.acceleratorCount;
    	      this.acceleratorManufacturers = defaults.acceleratorManufacturers;
    	      this.acceleratorNames = defaults.acceleratorNames;
    	      this.acceleratorTotalMemoryMiB = defaults.acceleratorTotalMemoryMiB;
    	      this.acceleratorTypes = defaults.acceleratorTypes;
    	      this.bareMetal = defaults.bareMetal;
    	      this.baselineEbsBandwidthMbps = defaults.baselineEbsBandwidthMbps;
    	      this.burstablePerformance = defaults.burstablePerformance;
    	      this.cpuManufacturers = defaults.cpuManufacturers;
    	      this.excludedInstanceTypes = defaults.excludedInstanceTypes;
    	      this.instanceGenerations = defaults.instanceGenerations;
    	      this.localStorage = defaults.localStorage;
    	      this.localStorageTypes = defaults.localStorageTypes;
    	      this.memoryGiBPerVCpu = defaults.memoryGiBPerVCpu;
    	      this.memoryMiB = defaults.memoryMiB;
    	      this.networkInterfaceCount = defaults.networkInterfaceCount;
    	      this.onDemandMaxPricePercentageOverLowestPrice = defaults.onDemandMaxPricePercentageOverLowestPrice;
    	      this.requireHibernateSupport = defaults.requireHibernateSupport;
    	      this.spotMaxPricePercentageOverLowestPrice = defaults.spotMaxPricePercentageOverLowestPrice;
    	      this.totalLocalStorageGB = defaults.totalLocalStorageGB;
    	      this.vCpuCount = defaults.vCpuCount;
        }

        public Builder acceleratorCount(@Nullable SpotFleetAcceleratorCountRequest acceleratorCount) {
            this.acceleratorCount = acceleratorCount;
            return this;
        }

        public Builder acceleratorManufacturers(@Nullable List<SpotFleetInstanceRequirementsRequestAcceleratorManufacturersItem> acceleratorManufacturers) {
            this.acceleratorManufacturers = acceleratorManufacturers;
            return this;
        }

        public Builder acceleratorNames(@Nullable List<SpotFleetInstanceRequirementsRequestAcceleratorNamesItem> acceleratorNames) {
            this.acceleratorNames = acceleratorNames;
            return this;
        }

        public Builder acceleratorTotalMemoryMiB(@Nullable SpotFleetAcceleratorTotalMemoryMiBRequest acceleratorTotalMemoryMiB) {
            this.acceleratorTotalMemoryMiB = acceleratorTotalMemoryMiB;
            return this;
        }

        public Builder acceleratorTypes(@Nullable List<SpotFleetInstanceRequirementsRequestAcceleratorTypesItem> acceleratorTypes) {
            this.acceleratorTypes = acceleratorTypes;
            return this;
        }

        public Builder bareMetal(@Nullable SpotFleetInstanceRequirementsRequestBareMetal bareMetal) {
            this.bareMetal = bareMetal;
            return this;
        }

        public Builder baselineEbsBandwidthMbps(@Nullable SpotFleetBaselineEbsBandwidthMbpsRequest baselineEbsBandwidthMbps) {
            this.baselineEbsBandwidthMbps = baselineEbsBandwidthMbps;
            return this;
        }

        public Builder burstablePerformance(@Nullable SpotFleetInstanceRequirementsRequestBurstablePerformance burstablePerformance) {
            this.burstablePerformance = burstablePerformance;
            return this;
        }

        public Builder cpuManufacturers(@Nullable List<SpotFleetInstanceRequirementsRequestCpuManufacturersItem> cpuManufacturers) {
            this.cpuManufacturers = cpuManufacturers;
            return this;
        }

        public Builder excludedInstanceTypes(@Nullable List<String> excludedInstanceTypes) {
            this.excludedInstanceTypes = excludedInstanceTypes;
            return this;
        }

        public Builder instanceGenerations(@Nullable List<SpotFleetInstanceRequirementsRequestInstanceGenerationsItem> instanceGenerations) {
            this.instanceGenerations = instanceGenerations;
            return this;
        }

        public Builder localStorage(@Nullable SpotFleetInstanceRequirementsRequestLocalStorage localStorage) {
            this.localStorage = localStorage;
            return this;
        }

        public Builder localStorageTypes(@Nullable List<SpotFleetInstanceRequirementsRequestLocalStorageTypesItem> localStorageTypes) {
            this.localStorageTypes = localStorageTypes;
            return this;
        }

        public Builder memoryGiBPerVCpu(@Nullable SpotFleetMemoryGiBPerVCpuRequest memoryGiBPerVCpu) {
            this.memoryGiBPerVCpu = memoryGiBPerVCpu;
            return this;
        }

        public Builder memoryMiB(@Nullable SpotFleetMemoryMiBRequest memoryMiB) {
            this.memoryMiB = memoryMiB;
            return this;
        }

        public Builder networkInterfaceCount(@Nullable SpotFleetNetworkInterfaceCountRequest networkInterfaceCount) {
            this.networkInterfaceCount = networkInterfaceCount;
            return this;
        }

        public Builder onDemandMaxPricePercentageOverLowestPrice(@Nullable Integer onDemandMaxPricePercentageOverLowestPrice) {
            this.onDemandMaxPricePercentageOverLowestPrice = onDemandMaxPricePercentageOverLowestPrice;
            return this;
        }

        public Builder requireHibernateSupport(@Nullable Boolean requireHibernateSupport) {
            this.requireHibernateSupport = requireHibernateSupport;
            return this;
        }

        public Builder spotMaxPricePercentageOverLowestPrice(@Nullable Integer spotMaxPricePercentageOverLowestPrice) {
            this.spotMaxPricePercentageOverLowestPrice = spotMaxPricePercentageOverLowestPrice;
            return this;
        }

        public Builder totalLocalStorageGB(@Nullable SpotFleetTotalLocalStorageGBRequest totalLocalStorageGB) {
            this.totalLocalStorageGB = totalLocalStorageGB;
            return this;
        }

        public Builder vCpuCount(@Nullable SpotFleetVCpuCountRangeRequest vCpuCount) {
            this.vCpuCount = vCpuCount;
            return this;
        }
        public SpotFleetInstanceRequirementsRequest build() {
            return new SpotFleetInstanceRequirementsRequest(acceleratorCount, acceleratorManufacturers, acceleratorNames, acceleratorTotalMemoryMiB, acceleratorTypes, bareMetal, baselineEbsBandwidthMbps, burstablePerformance, cpuManufacturers, excludedInstanceTypes, instanceGenerations, localStorage, localStorageTypes, memoryGiBPerVCpu, memoryMiB, networkInterfaceCount, onDemandMaxPricePercentageOverLowestPrice, requireHibernateSupport, spotMaxPricePercentageOverLowestPrice, totalLocalStorageGB, vCpuCount);
        }
    }
}
