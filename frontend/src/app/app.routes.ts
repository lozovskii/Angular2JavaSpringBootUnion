import {Routes} from "@angular/router";
import {HomeComponent} from "./components/home/home.component";
import {RegistrComponent} from "./components/registr/registr.component";
import {NoContentComponent} from "./components/no-content/no-content.component";

export const appRoutes: Routes =[
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full'
  },
  {
    path: 'home',
    component: HomeComponent
  },
  {
    path: 'registr',
    component: RegistrComponent
  },
  {
    path: '**',
    component: NoContentComponent
  }
];
