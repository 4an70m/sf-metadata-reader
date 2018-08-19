package sandbox.oleksii.project;

import sandbox.oleksii.project.metadata.appMenus.AppMenus;
import sandbox.oleksii.project.metadata.applications.Applications;
import sandbox.oleksii.project.metadata.approvalProcesses.ApprovalProcesses;
import sandbox.oleksii.project.metadata.assignmentRules.AssignmentRules;
import sandbox.oleksii.project.metadata.autoResponseRules.AutoResponseRules;
import sandbox.oleksii.project.metadata.certs.Certs;
import sandbox.oleksii.project.metadata.classes.Classes;
import sandbox.oleksii.project.metadata.cleanDataServices.CleanDataServices;
import sandbox.oleksii.project.metadata.communities.Communities;
import sandbox.oleksii.project.metadata.components.Components;
import sandbox.oleksii.project.metadata.connectedApps.ConnectedApps;
import sandbox.oleksii.project.metadata.dashboards.Dashboards;
import sandbox.oleksii.project.metadata.datacategorygroups.DataCategoryGroups;
import sandbox.oleksii.project.metadata.delegategroups.DelegateGroups;
import sandbox.oleksii.project.metadata.groups.Groups;
import sandbox.oleksii.project.metadata.homePageComponents.groups.HomePageComponents;
import sandbox.oleksii.project.metadata.labels.Labels;
import sandbox.oleksii.project.metadata.leadConvertSettings.LeadConvertSettings;
import sandbox.oleksii.project.metadata.matchingRules.MatchingRules;
import sandbox.oleksii.project.metadata.objects.Objects;
import sandbox.oleksii.project.metadata.pages.Pages;
import sandbox.oleksii.project.metadata.permissionSets.PermissionSets;
import sandbox.oleksii.project.metadata.sharingRules.SharingRules;
import sandbox.oleksii.project.metadata.sites.Sites;
import sandbox.oleksii.project.metadata.standardValueSetTranslations.StandardValueSetTranslations;
import sandbox.oleksii.project.metadata.standardValueSets.StandardValueSets;
import sandbox.oleksii.project.metadata.staticResources.StaticResources;
import sandbox.oleksii.project.metadata.tabs.Tabs;
import sandbox.oleksii.project.metadata.translations.Translations;
import sandbox.oleksii.project.metadata.triggers.Triggers;
import sandbox.oleksii.project.metadata.weblinks.Weblinks;
import sandbox.oleksii.project.metadata.workflows.Workflows;

import java.io.File;

/**
 * Created by User on 04.01.2018.
 */
public class Project {

    private File root;

    public Pages pages;
    public Classes classes;
    public Triggers triggers;
    public Objects objects;
    public Components components;
    public Applications applications;
    public AppMenus appMenus;
    public AssignmentRules assignmentRules;
    public Certs certs;
    public Workflows workflows;
    public ApprovalProcesses approvalProcesses;
    public AutoResponseRules autoResponseRules;
    public Communities communities;
    public ConnectedApps connectedApps;
    public Weblinks webLinks;
    public Sites sites;
    public Tabs tabs;
    public Translations translations;
    public StaticResources staticResources;
    public StandardValueSets standardValueSets;
    public StandardValueSetTranslations standardValueSetTranslations;
    public Groups groups;
    public HomePageComponents homePageComponents;
    public Labels labels;
    public LeadConvertSettings leadConvertSettings;
    public MatchingRules matchingRules;
    public SharingRules sharingRules;
    public CleanDataServices cleanDataServices;
    public DataCategoryGroups dataCategoryGroups;
    public DelegateGroups delegateGroups;
    public Dashboards dashboards;
    public PermissionSets permissionSets;

    public Project(String rootPath) {
        this.root = new File(rootPath);
        this.readFolders(rootPath);
    }

    private void readFolders(String rootPath) {
//        this.pages = new Pages(rootPath);
//        this.classes = new Classes(rootPath);
//        this.triggers = new Triggers(rootPath);
//        this.objects = new Objects(rootPath);
//        this.components = new Components(rootPath);
//        this.applications = new Applications(rootPath);
//        this.appMenu = new AppMenu(rootPath);
//        this.assignmentRules = new AssignmentRules(rootPath);
//        this.certs = new Certs(rootPath);
//        this.workflows = new Workflows(rootPath);
//        this.approvalProcesses = new ApprovalProcesses(rootPath);
//        this.autoResponseRules = new AutoResponseRules(rootPath);
//        this.communities = new Communities(rootPath);
//        this.connectedApps = new ConnectedApps(rootPath);
//        this.webLinks = new Weblinks(rootPath);
//        this.sites = new Sites(rootPath);
//        this.tabs = new Tabs(rootPath);
//        this.translations = new Translations(rootPath);
//        this.staticResources = new StaticResources(rootPath);
//        this.standardValueSets = new StandardValueSets(rootPath);
//        this.standardValueSetTranslations = new StandardValueSetTranslations(rootPath);
//        this.groups = new Groups(rootPath);
//        this.homePageComponents = new HomePageComponents(rootPath);
//        this.labels = new Labels(rootPath);
//        this.leadConvertSettings = new LeadConvertSettings(rootPath);
//        this.matchingRules = new MatchingRules(rootPath);
//        this.sharingRules = new SharingRules(rootPath);
//        this.cleanDataServices = new CleanDataServices(rootPath);
//        this.dataCategoryGroups = new DataCategoryGroups(rootPath);
//        this.delegateGroups = new DelegateGroups(rootPath);
//        this.dashboards = new Dashboards(rootPath);
        this.permissionSets = new PermissionSets(rootPath);
    }


    public static void main(String[] args) throws Exception {
//        Project p2 = new Project("C:\\Users\\4an70m\\Documents\\sublime\\hwks-aorta-dev3\\src");
        Project p = new Project("avis-prod-src");
        System.out.println(p.permissionSets.getMetadata().get(0).getEntity());
//        FolderWithMeta f = (FolderWithMeta) p.dashboards.getFolders().get(0);
//        XmlMetadata m = (XmlMetadata) f.getMetadata().get(0);
//        System.out.println(m.getEntity());
//        System.out.println(p2.permissionSets.getMetadata().isEmpty());
//        XmlPojoEntity metaPojo = p.delegateGroups.getMetadata().get(0).getEntity();
//        p.delegateGroups.getMetadata().get(0).writeToFile();
//        System.out.println(pojo);
//        p.classes.getMetadata()
//                .stream()
//                .forEach(classesMetadata -> {
//                    if (classesMetadata.getRelatedMeta().getEntity().getApiVersion().contains("39.0")) {
//                        System.out.println(classesMetadata.getName());
//                    }
//                });
    }

//ToDo-ing:
//dashboards
//settings


//ToDo:
//email
//documents
//duplicateRules
//escalationRules
//flexipages
//flowDefinitions
//flows
//globalValueSets
//homePageLayouts
//installedPackages
//layouts
//letterhead
//newreps
//objectTranslations
//portals
//profilePasswordPolicies
//profiles
//profileSessionSettings
//queues
//quickActions
//remoteSiteSettings
//reports
//reportTypes
//roles
//scontrols
}
